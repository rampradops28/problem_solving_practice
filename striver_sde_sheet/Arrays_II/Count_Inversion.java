package striver_sde_sheet.Arrays_II;

import java.util.ArrayList;
import java.util.List;

public class Count_Inversion {
    // static int inversionCount(int arr[]) { // brute force
        
    //     int n = arr.length;
    //     int cnt = 0;
        
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i] > arr[j]){
    //                 cnt++;
    //             }
    //         }
    //     }
        
    //     return cnt;
        
    // }
    public static int mergesort(int[] arr, int low, int mid, int high){ // optimal
        
        int cnt = 0;
        List<Integer> ls = new ArrayList<>();
        
        int left = low;
        int right = mid+1;
        
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                ls.add(arr[left]);
                left++;
            }
            else {
                ls.add(arr[right]);
                cnt += (mid-left)+1;
                right++;
            }
        }
        
        while(left <= mid){
            ls.add(arr[left]);
            left++;
        }
        
        while(right <= high){
            ls.add(arr[right]);
            right++;
        }
        
        for(int i=low;i<=high;i++){
            arr[i] = ls.get(i-low);
        }
        
        return cnt;
    }
    public static int sort(int[] arr, int low,int high){
        
        int cnt = 0;
        int n = arr.length;
        
        if(low >= high) return cnt;
        int mid = (low+high)/2;
        
        cnt += sort(arr,low,mid);
        cnt += sort(arr,mid+1,high);
        cnt += mergesort(arr,low,mid,high);
        
        return cnt;
    }
    static int inversionCount(int arr[]) {
        return sort(arr,0,arr.length - 1);
    }
    public static void main(String[] args) { 
        int[] arr = {2, 4, 1, 3, 5};  

        int count = inversionCount(arr);
        System.out.println("Number of inversions: " + count); // output : 3
    }
}
