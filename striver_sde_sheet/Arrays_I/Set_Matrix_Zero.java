public class Set_Matrix_Zero {  
    // public static void setZeroes(int[][] matrix) { // better
        
    //     int r = matrix.length;
    //     int c = matrix[0].length;
         
    //      int row[] = new int[r];
    //      int col[] = new int[c];

    //      for(int i=0;i<r;i++){
    //         for(int j=0;j<c;j++){
    //             if(matrix[i][j] == 0){
    //                 row[i] = 1;
    //                 col[j] = 1;
    //             }
    //         }
    //      }

    //      for(int i=0;i<r;i++){
    //         for(int j=0;j<c;j++){
    //             if(row[i] == 1 || col[j] == 1){
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //      }

    // }
    public static void setZeroes(int[][] matrix) { // optimal
        
        int r = matrix.length;
        int c = matrix[0].length;
        int col1 = 1;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){

                if(matrix[i][j] == 0){
                    matrix[i][0] = 0; 
                

                    if(j != 0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col1 = 0;
                    }
                }
            }
        }

        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j=0;j<c;j++){
                matrix[0][j] = 0;
            }
        }

        if(col1 == 0){
            for(int i=0;i<r;i++){
                matrix[i][0] = 0;
            }
        }

    }
    public static void main(String[] args) {
        int[][] matrix = {
        {1, 1, 1},
        {1, 0, 1},
        {1, 1, 1}
        };
        setZeroes(matrix); // Output should be:
                            // [[1,0,1],[0,0,0],[1,0,1]]
        System.out.println(java.util.Arrays.deepToString(matrix));
    }
}
