public class two_dice_problem {
    public static int func(int sum){

        if(sum < 2 || sum > 12) return 0;

        int cnt = 0;
        for(int i=1;i<=6;i++){
            if((sum - i) <= 6){
                System.out.println("i : "+i+"," +"j: "+(sum-i));
                cnt++;
            }
        }
        
        return cnt;
    }
    public static void main(String[] args) {
        int sum = 10;
        System.out.println(func(sum));
    }
}
