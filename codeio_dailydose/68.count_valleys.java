public class count_valleys {
    public static int countingValleys(int steps, String path) {
        
        int height = 0;
        int count = 0;
        
        for(int i=0;i<steps;i++){
            if(path.charAt(i) == 'D'){
                height -= 1;
            }
            else if(path.charAt(i) == 'U'){
                height += 1;
                if(height == 0){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int n = 8;
        String str = "UDDDUDUU";

        System.out.println("Count: "+countingValleys(n, str));
    }
}
