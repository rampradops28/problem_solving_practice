class logic_building{
    public static void print1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void print4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void print5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print6(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void print7(int n){
        for(int i=0;i<n;i++){

            //space 
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            } 

            //space 
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void print8(int n){
        for(int i=0;i<n;i++){

            //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0;j<(2*n)-(2*i+1);j++){
                System.out.print("*");
            }

            //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void print9(int n){
        for(int i=0;i<n;i++){

            //space 
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            } 

            //space 
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){

            //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0;j<(2*n)-(2*i+1);j++){
                System.out.print("*");
            }

            //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void print10(int n){
        for(int i=1;i<=n*2-1;i++){

            int ind = i;
            if(i>=n)  ind = 2*n-i; 

            for(int j=1;j<=ind;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void print11(int n){
        int ans = 1 ;
        for(int i=0;i<n;i++){ 
            if(i%2==0) ans = 1;
            for(int j=0;j<=i;j++){
                System.out.print(ans+" ");
                ans = 1-ans;
            }
            System.out.println();
        }
    }
    public static void print12(int n){
        int spaces = 2*n-1;
        for(int i=1;i<=n;i++){

            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }

            //spaces
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }

            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            spaces-=2;
        }
    }
    public static void print13(int n){
        int no = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(no+" ");
                no++;
            }
            System.out.println();
        }
    }
    public static void print14(int n){
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void print15(int n){
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+(n-i-1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void print16(int n){
        for(int i=0;i<n;i++){
            char z = (char)('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(z+" "); 
            } 
            System.out.println();
        }
    }
    public static void print17(int n){
        for(int i=0;i<n;i++){
            
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //words
            char z = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(z+" ");
                if(j <= breakpoint) z++;
                else z--;
            }

            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    public static void print18(int n){
                for(int i=0;i<n;i++){
            char start = (char)('A'+n-1);
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start--;
            }
            System.out.println();
        }
    }
    public static void print19(int n){
        int start = 0;
        for(int i=0;i<n;i++){

            //stars
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }

            //space
            for(int j=0;j<start;j++){
                System.out.print(" ");
            }

             start+=2;

            //stars
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
           
        }

        int end = 2*n-2;
        for(int i=1;i<=n;i++){

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            //space
            for(int j=0;j<end;j++){
                System.out.print(" ");
            }
           

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

             end-=2;
            System.out.println();
        }
    }
    public static void print20(int n){
        int start = 2*n-2;
        for(int i=1;i<=n;i++){
            
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            //spaces
            for(int j=0;j<start;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            start+=2;
            System.out.println();

        }

        int end = 0;
        for(int i=1;i<=n;i++){

            //stars
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }

            //spaces
            for(int j=0;j<end;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            end-=2;
            System.out.println();

        }
    }
    public static void print21(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == n-1 || i == 0 || j == n-1 || j == 0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 5;
        print3(n);
    }
}