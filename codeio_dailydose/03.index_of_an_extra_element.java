public class index_of_an_extra_element {
    public static int findExtra(int a[], int b[]) {  //brute - linear search
        
        int alen = a.length;
        int blen = b.length;
        int tot = Math.min(alen,blen); 
        
        for(int i=0;i<tot;i++){
            if(a[i] != b[i]){
                return i;
            } 
        }
        
        return alen>blen ? alen-1 : blen-1;
    }
//     public int findExtra(int a[], int b[]) { //optimal - binary search
        
//         int alen = a.length;
//         int blen = b.length;
//         int tot = Math.max(alen,blen);
        
//         int start = 0;
//         int end = tot-1;
//         int index = 0;
//         int mid;
        
//         while(start <= end){
            
//             mid = (start+end) / 2;
            
//             if(mid < blen && a[mid] == b[mid]){
//                 start = mid+1;
//             }
//             else{
//                 index = mid;
//                 end = mid-1;
//             }
//         }
//         return index;
//    }
    public static void main(String[] args) { 

        int[] a1 = {433, 483, 577, 685, 800, 850, 940};
        int[] b1 = {433, 483, 577, 685, 800, 850};
        
        int[] a2 = {1, 2, 3, 4, 5};
        int[] b2 = {1, 2, 3, 4};
        
        int[] a3 = {10, 20, 30};
        int[] b3 = {10, 20, 30, 40};
        
        System.out.println("Extra element index in a1: " + findExtra(a1, b1)); // Expected output: 6
        System.out.println("Extra element index in a2: " + findExtra(a2, b2)); // Expected output: 4
        System.out.println("Extra element index in a3: " + findExtra(a3, b3)); // Expected output: 3
    }
}
