public class Pow_X_and_N {
    public static void main(String args[])
    {
        System.out.println(myPow(2,10));
    }
    // public static double myPow(double x, int n) { // brute force
    //     double ans = 1.0;
    //     long no = Math.abs(n);
    //     for(int i=1;i<=no;i++){
    //         ans *= x;
    //     }
    //     if(n<0){
    //         return 1/ans;
    //     }
    //     return ans;
    // }
    public static double myPow(double x, int n) { // optimal
    double ans = 1.0;
    long nn = n;
    if (nn < 0) nn = -1 * nn;
    while (nn > 0) {
      if (nn % 2 == 1) {
        ans = ans * x;
        nn = nn - 1;
      } else {
        x = x * x;
        nn = nn / 2;
      }
    }
    if (n < 0) ans = (double)(1.0) / (double)(ans);
    return ans;
  }
}
