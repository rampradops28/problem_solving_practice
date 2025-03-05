public class binary_count_one {
    public static void func(int n){ 
        int cnt = 0;
        
        while(n > 0){   
            if(n%2 == 1){
                cnt++;
            }
            n /= 2; 
        }
        
        System.out.print(cnt);
    }
	public static void main(String[] args) {
	    int n = 6;
	    func(n);
	}
}
