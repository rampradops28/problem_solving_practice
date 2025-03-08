public class move_hypen_to_front {
    public static String func(String str){

        int cnt = 0; 
        String s = "";

        int n = str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i) == '-'){
                cnt++;
            }
            else{ 
                s += str.charAt(i);
            }
        }

        for(int i=0;i<cnt;i++){ 
            s = "-" + s;
        }

        return s;
    }
    public static void main(String[] args) {
        String str = "move-hypen-to-front";
        System.out.println("final String: "+func(str));
    }
}

// public class sum_of_difference {
//     public static int func(int m, int n){

//         int sum1 = 0;
//         int sum2 = 0;

//         for(int i=1;i<=n;i++){
//             if(i%4 == 0){
//                 sum1 += i;
//             }
//             else{
//                 sum2 += i;
//             }
//         }

//         return Math.abs(sum1-sum2);
//     }
//     public static void main(String[] args) {
//         int m = 4;
//         int n = 20;
//         System.out.println("Difference of Sum: "+func(m,n));
//     }
// }
