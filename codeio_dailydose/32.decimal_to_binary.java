public class decimal_to_binary {
    public static void main(String args[]){
        int n = 9;
        System.out.println(decToBinary(n));
    }
    static String decToBinary(int n) {
        String res = "";
     
     if (n == 0) {
         return "0";
     }
     
     while(n != 0){
         res = (n % 2) + res;
         n /= 2;
     }
     
     return res;
 }
}
