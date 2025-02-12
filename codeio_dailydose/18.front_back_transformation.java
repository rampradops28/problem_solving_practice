// link = https://www.geeksforgeeks.org/problems/front-back-transformation1659/0

public class front_back_transformation {
    public static void main(String[] args) {
        String input1 = "HelloWorld"; // output : SvoolDliow
        String input2 = "abcXYZ"; // output : zyxCBA
        String input3 = "Java123"; // output : Qzezª??

        System.out.println("Input: " + input1 + ", Converted: " + convert(input1));
        System.out.println("Input: " + input2 + ", Converted: " + convert(input2));
        System.out.println("Input: " + input3 + ", Converted: " + convert(input3));
    }
    static String convert(String s)
    {
        int n = s.length();
        StringBuilder str = new StringBuilder();
       
        for(int i=0;i<n;i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                str.append((char)(155 - s.charAt(i)));
            }
            else{
                str.append((char)(219 - s.charAt(i)));
            }
        }
        return str.toString();
    }
}
