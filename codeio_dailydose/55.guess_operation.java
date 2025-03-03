public class guess_operation {
    public static char func(int a, int b){
        
        char ch = ' ';
        if(a>0 && b>0 || a<0 && b<0){
            ch = '*';
        }
        else if(a>0 && b<0){
            ch = '-';
        }
        else{
            ch = '+';
        }

        return ch;
    }
    public static void main(String[] args) {
        int a = -2;
        int b = -5;

        System.out.println(func(a,b));
    }
}
