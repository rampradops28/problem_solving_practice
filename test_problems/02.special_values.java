/*Write a program that finds all numbers in a given range [a,b) that contain a specific digit k exactly d times. 
  The program should store these numbers in a array, print them, and display the total count.

Input Format
    An integer a (starting value of the range).
    An integer b (ending value of the range, exclusive).
    An integer k (the target digit).
    An integer d (the required count of digit k in a number).

Constraints
    1 ≤ a
    0 ≤ k ≤ 9

Output Format
    Print the list of valid numbers.
    Print the total count of such numbers.

Sample Input 0
    1
    300
    2
    2

Sample Output 0
    [22, 122, 202, 212, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 232, 242, 252, 262, 272, 282, 292]
    21

Explanation 0
    Given Output array contains the digit k has present d times in the range */
 
public class 02.special_values {
    public static boolean valid(int num,int tar, int cnt){
       
        int rem = 0;
        int numcnt = 0;
        while(num > 0){
              rem = num%10;
               
            if(rem == tar){
                numcnt++;
                if(numcnt == cnt){
                    return true;
                }
            }
            num /= 10;
        }
       
        return false;
    }
   
    public static void func(int  start, int end, int tar, int cnt){
       
        List<Integer> ans = new ArrayList<>();
       
        for(int i=start;i<=end;i++){
            if(valid(i,tar,cnt)){
                  ans.add(i);
            }
        }
       
        int n = ans.size();
        System.out.print("[");
        for(int i=0;i<n-1;i++){
            System.out.printf("%d, ",ans.get(i));
             
           
        }
        System.out.printf("%d",ans.get(n-1));
        System.out.println("]");
       
        System.out.println(n);
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        int start = sc.nextInt();
        int end = sc.nextInt();
        int tar = sc.nextInt();
        int cnt = sc.nextInt();
       
        func(start,end,tar,cnt);
    }
}
