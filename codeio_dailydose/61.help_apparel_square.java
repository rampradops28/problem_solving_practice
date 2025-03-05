public class help_apparel_square {
    public static boolean isSquare(int val){
        if(val == Math.pow(Math.sqrt(val),2)){
            return true;
        }
        return false;
    }
    public static void func(int[] arr){
        
        int n = arr.length;
        int cnt = 0;
        int maxi =  Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(isSquare(arr[i])){
                cnt++;
                maxi = Math.max(arr[i],maxi);
            }
        }
        
        System.out.println("Count: "+cnt);
        System.out.println("Maximum Sqaure: "+maxi);
    }
	public static void main(String[] args) {
	    int arr[] = {79,77,54,81,48,34,25,16};
	    func(arr);
	}
}
