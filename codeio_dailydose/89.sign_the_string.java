public class sign_the_string {
    public static int func(String str){

        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '*'){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }

        return cnt1 - cnt2;
    }
    public static void main(String[] args) {
        String str = "#*#";
        System.out.println(func(str));
    }
}
