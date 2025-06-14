import java.util.Arrays;

public class Next_Permutation 
{
    // brute force :
    
    //Step 1: Find all possible permutations of elements present and store them.

    //Step 2: Search input from all possible permutations.

    //Step 3: Print the next permutation present right after it.

    public static void nextPermutation(int[] nums) { // optimal
        
        int n = nums.length;
        int ind = -1;

        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }

        if(ind == -1){
            Arrays.sort(nums);
            return;
        }

        for(int i=n-1;i>ind;i--){
            if(nums[i] > nums[ind]){

                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;

                break;
            }
        }
        
        int left = ind + 1, right = n - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; 
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // Output: [1, 3, 2]
    }
}
