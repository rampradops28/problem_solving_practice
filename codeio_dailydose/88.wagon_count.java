public class wagon_count {
    public static void func(int v, int w){

        if(w<2 || w%2 != 0 || w<v){
            System.out.println("Input Not Possible");
        }

        int x = (4*v-w) / 2;
        int y = v - x;

        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        int v = 200;
        int w = 540;

        func(v,w); 
    }
}
