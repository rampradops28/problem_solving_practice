
class basic_program{

    public static void print1toN(int ind, int n){
        if(ind >= n) return;
        System.out.println(ind);
        print1toN(ind+1, n);
    }

    public static void print1toNbt(int ind){ // not using f(i+1,n)
        if(ind<1) return;
        print1toNbt(ind-1);
        System.out.println(ind);
    }

    public static void printNto1(int ind, int n){
        if(ind<1) return;
        System.out.println(ind);
        printNto1(ind-1, n);
    }

    public static void printNto1bt(int ind,int n){ // not using f(i-1,n)
        if(ind>n) return;
        printNto1bt(ind+1, n);
        System.out.println(ind);
    }

    public static void add(int ind,int sum){
        if(ind<1){
            System.out.println(sum);
            return;
        }
        add(ind-1,sum+ind);
    }

    public static int fibonacci(int n){
        if(n <= 1) return n; // n is either 0 or 1

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }

    public static void reverse(int i,int arr[],int n){
        if(i>=n/2) return;

        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverse(i+1, arr, n); 
    }

    public static boolean palindrome(int i,String name){
        
        if(i >= name.length()/2) return true;

        if(name.charAt(i) != name.charAt(name.length()-i-1)) return false;

        return palindrome(i+1, name);
    }

    public static void main(String args[]){
        
        int n = 5;
        // print1toN(1,n);

        // print1toNbt(n);

        // printNto1(n,n);

        // printNto1bt(1, n);

        // add(n,0);

        // System.out.println(fact(n));

        // System.out.println(fibonacci(n));

        // int n = 5;
        int arr[] = {1,2,3,4,5};

        reverse(0,arr,n);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        // String name = "madum";

        // System.out.println(palindrome(0,name));

        


       
    }
}