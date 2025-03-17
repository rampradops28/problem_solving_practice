public class no_of_open_doors {
    public static void main(String[] args) {
        long n = 2;
        System.out.println(noOfOpenDoors(n));
    }
    static int noOfOpenDoors(Long n) {
        return (int)Math.sqrt(n); 
    }
}
