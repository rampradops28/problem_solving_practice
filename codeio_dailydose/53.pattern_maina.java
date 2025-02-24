public class pattern_maina {
    public static void func(int n){
        
        int space = 2*n-2;
        for(int i=1;i<=n;i++){
            
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            
            //spaces
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            
            //numbers
            // for(int j=i;j>=1;j--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            
            System.out.println();
            space -= 2;
            
        }
    }
	public static void main(String[] args) {
		int n = 5;
		func(n);
	}
}
