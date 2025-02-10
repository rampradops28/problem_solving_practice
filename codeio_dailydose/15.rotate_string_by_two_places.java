class rotate_string_by_two_places{
    public static void main(String[] args) {
        String s1 = "daxjheq";
        String s2 = "eqdaxjh";
        System.out.println(isRotation(s1, s2)); // Output: true
    } 
    public static boolean isRotation(String s1, String s2) {
        
        
        StringBuilder res = new StringBuilder();
        StringBuilder ans = new StringBuilder(s2);
        int n = s1.length();
        
        if(n<2) return false;
        
        for(int i=2;i<n;i++){
            res.append(s1.charAt(i));
        }
        res.append(s1.charAt(0));
        res.append(s1.charAt(1));
        
        if(res.toString().equals(ans.toString())){
            return true;
        }
       
        
        StringBuilder res2 = new StringBuilder();
        res2.append(s1.charAt(n-2));
        res2.append(s1.charAt(n-1));
        
        for(int i=0;i<n-2;i++){
            res2.append(s1.charAt(i));
        }
        
        if(res2.toString().equals(ans.toString())){
            return true;
        }
        
        return false;
    }
}