// class sorting{ //Quick sort

//     static int partition(int arr[], int low, int high) {
            
//         int pivot = arr[low];
//         int i = low;
//         int j = high;
        
//         while(i<j){
            
//             while(arr[i] <= pivot && i <= high-1) i++;
            
//             while(arr[j] > pivot && j >= low+1) j--;
            
//             if(i<j){
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
        
//         int s = arr[low];
//         arr[low] = arr[j];
//         arr[j] = s;
        
//         return j;
//     }

    
//     static void quickSort(int arr[], int low, int high) {
            
//         if(low < high){
//         int part = partition(arr,low,high);
//         quickSort(arr,low,part-1);
//         quickSort(arr,part+1,high);
//         }
//     }

//     public static void main(String args[]){
//         int arr[] = {4,6,2,5,7,9,1,3};
//         quickSort(arr, 0, arr.length-1);

//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }

// }

import java.util.ArrayList;
import java.util.List;

class sorting{

    public static void merge(int arr[],int low, int mid, int high){

        List<Integer> res = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){

            if(arr[left] <= arr[right]){
                res.add(arr[left]);
                left++;
            }
            else{
                res.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            res.add(arr[left]);
            left++;
        }

        while(right <= high){
            res.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
             arr[i] = res.get(i-low);
        }
    }
    public static  void  mergeSort(int arr[], int low, int high){
        if(low >= high) return;

        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
        
    }
    public static void main(String args[]){
        int arr[] = {4,6,2,5,7,9,1,3};
        mergeSort(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}