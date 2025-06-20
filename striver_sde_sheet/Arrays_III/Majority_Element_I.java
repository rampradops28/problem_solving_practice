// import java.util.HashMap;
// import java.util.Map;

public class Majority_Element_I {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};  
         
        int result = majorityElement(arr);
        
        System.out.println("Majority element is: " + result);
    }
    
    // public static int majorityElement(int[] nums) { // brute force
    //     int n = nums.length;
    //     int cnt;

    //     for(int i=0;i<n;i++){
    //         cnt = 0;
    //         for(int j=0;j<n;j++){
    //             if(nums[i] == nums[j]){
    //                 cnt++;
    //             }
    //         }
    //         if(cnt > (n/2)){
    //             return nums[i];
    //         }
    //     }

    //     return -1;
    // }
    // public static int majorityElement(int[] nums) { // better
        
    //     int n = nums.length; 

    //     HashMap<Integer,Integer> map = new HashMap<>();

    //     for(int i=0;i<n;i++){
    //         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    //     }

    //     for(Map.Entry<Integer,Integer> it : map.entrySet()){
    //         if(it.getValue() > (n/2)){
    //             return it.getKey();
    //         }
    //     }

    //     return -1;
    // }
    public static int majorityElement(int[] nums) { //optimal
        
        int n = nums.length; 

        int cnt = 0;
        int ele = 0;

        for(int i=0;i<n;i++){
            if(cnt == 0){
                cnt = 1;
                ele = nums[i];
            }
            else if(ele == nums[i]){
                cnt++;
            }
            else{
                cnt --;
            }
        }

        int cnt1 = 0;
        for(int i=0;i<n;i++){
            if(ele == nums[i]){
                cnt1++;
            }
        }

        if(cnt1 > (n/2)) return ele;
        return -1;
    }
}
