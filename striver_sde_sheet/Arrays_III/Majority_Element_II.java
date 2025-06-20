import java.util.ArrayList;
// import java.util.HashMap;
import java.util.List;

public class Majority_Element_II {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1, 1}; 
         
        List<Integer> result = majorityElement(arr);
        
        System.out.println("Elements appearing more than n/3 times: " + result);
    }
    
    // public static List<Integer> majorityElement(int[] nums) { // brute force
    //     int n = nums.length;
    //     List<Integer> ls = new ArrayList<>();
    //     for(int i=0;i<n;i++){
    //         if(ls.size() == 0 || !ls.contains(nums[i])){
    //             int cnt = 0;
    //             for(int j=0;j<n;j++){
    //                 if(nums[i] == nums[j]){
    //                     cnt++;
    //                 }
    //             }
    //             if(cnt > (n/3)){
    //                 ls.add(nums[i]);
    //             }
    //         }
    //         if(ls.size() == 2) break;
    //     }
    //     return ls;
    // }
    // public static List<Integer> majorityElement(int[] nums) { // better
        
    //     int n = nums.length;

    //     List<Integer> ls = new ArrayList<>();
    //     HashMap<Integer,Integer> map = new HashMap<>();

    //     int val = (int)(n/3)+1;

    //     for(int i=0;i<n;i++){
    //         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
    //         if(map.get(nums[i]) == val){
    //             ls.add(nums[i]);
    //         }

    //         if(ls.size() == 2) break;
    //     }

    //     return ls;

    // }
    public static List<Integer> majorityElement(int[] nums) { // optimal
        
        int n = nums.length;

        List<Integer> ls = new ArrayList<>();
        
        int cnt1 = 0;
        int ele1 = 0;
        int cnt2 = 0;
        int ele2 = 0;

        for(int i=0;i<n;i++){
            if(cnt1 == 0 && ele2 != nums[i]){
                cnt1 = 1;
                ele1 = nums[i];
            }
            else if(cnt2 == 0 && ele1 != nums[i]){
                cnt2 = 1;
                ele2 = nums[i];
            }
            else if(ele1 == nums[i]){
                cnt1++;
            }
            else if(ele2 == nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        } 

        cnt1 = 0;
        cnt2 = 0;

        for(int i=0;i<n;i++){
            if(ele1 == nums[i]) cnt1++;
            if(ele2 == nums[i]) cnt2++;
        }

        int val = (int)(n/3) + 1;
        if(cnt1 >= val) ls.add(ele1);
        if(cnt2 >= val && ele2 != ele1) ls.add(ele2);

        return ls;

    }
}
