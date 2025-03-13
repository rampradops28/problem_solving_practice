public class largest_number_with_sum {
    public static void main(String[] args) {
        int n = 5;
        int m = 12;

        System.out.println(largestNumber(n, m));
    }
    static String largestNumber(int n, int sum) {
        if (9 * n < sum) {
            return "-1";
        }

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (sum >= 9) {
                s.append("9");
                sum -= 9;
            } else {
                s.append(sum);
                sum = 0;
            }
        }

        return s.toString();
    }
}
