//link: https://www.geeksforgeeks.org/problems/implement-strstr/1

public class first_occurence {
    public static void main(String[] args) {
        String txt1 = "GeeksForGeeks";
        String pat1 = "Fr";
        System.out.println(firstOccurence(txt1, pat1));  // Output: -1

        String txt2 = "GeeksForGeeks";
        String pat2 = "For";
        System.out.println(firstOccurence(txt2, pat2));  // Output: 5
    }
    static int firstOccurence(String txt, String pat) {
         
        int n = txt.length();
        int patlen = pat.length(); 

        int start = 0;
        int index = 0;
        int flag = 0;
         
        for(int i=0;i<n;i++){
            start = i;
            if(txt.charAt(i) == pat.charAt(0)){ 
                
                for(int j=0;j<patlen;j++){
                    
                    if(txt.charAt(start) == pat.charAt(j)){
                         start++;
                         flag = 1;
                    }
                    else{
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag == 1){
                index = i;
                return index;
            }
        }
        
        return -1;
    }
}
