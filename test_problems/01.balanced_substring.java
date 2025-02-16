/*Write a program that counts the number of balanced substrings in a given string consisting of characters 'R' and 'L'. 
  A substring is considered balanced if it contains an equal number of 'R' and 'L' characters. 
  The program should take a string as input and output the total number of such balanced substrings.

Input Format:
    First Line Input Consists of a String.

Constraints:
    String not will be Empty

Output Format:
    First Line of Output Displays the count of Substring balanced.

Sample Input 0
    LLRRLLR
Sample Output 0
    
1
Explanation 0
    L L - IS BALANCED WITH R R, SO - 1
    L L - R DOES NOT BALANCED NOT INCREMENTED THE VALUE */

class balanced_substring{
    public static int func(String str){
       
        int n = str.length();
        int l = 0;
        int r = 0;
        int res = 0;
       
        for(int i=0;i<n;i++){
            if(str.charAt(i) == 'L'){
                l++;
            }
            if(str.charAt(i) == 'R'){
                r++;
            }
           
            if(l == r){
                res += 1;
            }
        }
        return res;
         
    }
    public static void main(String[] args) {
    String str = "LLRRLLRR";
    int ans = func(str);

    System.out.println(ans);
    }
}