class red_or_green{
    public static void main(String[] args) {
        int n = 5;
        String s = "RGRGR";
        System.out.println(RedOrGreen(n, s));
    }
    static int RedOrGreen(int N, String S) {
       
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<N;i++){
            char s = S.charAt(i);
            if(s == 'R'){
                count1++;
            }
            else if(s == 'G'){
                count2++;
            }
        }
        
        int min = Math.min(count1,count2);
        
        return min;
     }
}