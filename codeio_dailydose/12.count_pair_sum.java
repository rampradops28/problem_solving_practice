public class count_pair_sum {
    static int countPairs(int arr1[], int arr2[], int x) {
        
        int alen = arr1.length;
        int blen = arr2.length;
        
         
        int cnt = 0;
        int i = 0;
        int j = blen-1;
        
        while(i<alen && j>=0){
          int sum = arr1[i]+arr2[j];
          if(sum == x){
              cnt++;
              i++;
              j--;
              
          } 
          else if(sum < x){
              i++;
          }
          else{
              j--;
          } 
        }
        
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 7};
        int[] arr2 = {5, 6, 3, 4, 8};
        int x = 9;

        System.out.println("Number of pairs with sum " + x + ": " + countPairs(arr1, arr2, x));
    }
}
