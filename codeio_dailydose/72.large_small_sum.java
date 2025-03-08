public class large_small_sum { 
    public static int func(int []a){
        int n = a.length;

        int maxe = Integer.MIN_VALUE;
        int smaxe = Integer.MIN_VALUE;

        for(int i=0;i<n;i+=2){
            if(a[i] > maxe){
                smaxe = maxe;
                maxe = a[i];
                
            }
            else if(a[i] != smaxe && a[i] > smaxe){
                smaxe = a[i];
            }
        }

        System.out.println(smaxe);
        int maxo = Integer.MIN_VALUE;
        int smaxo = Integer.MIN_VALUE;

        for(int i=1;i<n;i+=2){
            if(a[i] > maxo){
                smaxo = maxo;
                maxo = a[i];
                
            }
            else if(a[i] != smaxo && a[i] > smaxo){
                smaxo = a[i];
            }
        }

        System.out.println(smaxo);
        return smaxe+smaxo;


    }
    public static void main(String[] args) {
        int[] a = {3,2,1,7,5,4};

        System.out.println("Result: "+func(a));
    }
}
