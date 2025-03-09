public class max_exponential {
    public static int func(int a, int b){

        int maxCount = 0;
        int result = a;

        for (int i = a; i <= b; i++) {
            int cnt = 0;
            int num = i;

            while (num % 2 == 0 && num > 0) {
                num = num / 2;
                cnt++;
            }

            if (cnt > maxCount) {
                maxCount = cnt;
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int a = 7;
        int b = 12;

        System.out.println("maximum: "+func(a,b));
    }
}
