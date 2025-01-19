import java.util.ArrayList; 

 

// class Solution { // brute force
//     public static boolean condition(int row, int col, char[][] board){

//         int copyrow = row;
//         int copycol = col;

//         while(row >= 0 && col >= 0){
//             if(board[row][col] == 'Q') return false; 
//             row--;
//             col--;
//         }

//         row = copyrow;
//         col = copycol;

//         while(col >= 0){
//             if(board[row][col] == 'Q') return false;
//             col--;
//         }

//         row = copyrow;
//         col = copycol;

//         while(col >= 0 && row < board.length){
//             if(board[row][col] == 'Q') return false;
//             row++;
//             col--;
//         }

//         return true;

//     }
//     public static void func(int col, char[][] board, List<List<String>> res, int n){
//         if(col == board.length){
//             res.add(construct(board));
//             return;
//         }

//         for(int row=0;row<n;row++){
//             if(condition(row,col,board)){
//                 board[row][col] = 'Q';
//                 func(col+1, board, res, n);
//                 board[row][col] = '.';
//             }
//         }
//     }
//     public static List<String> construct(char[][] board){
//         List<String> res = new LinkedList<String>();

//         for(int i=0;i<board.length;i++){
//             String s = new String(board[i]);
//             res.add(s);
//         }

//         return res;
//     }
//     public List<List<String>> solveNQueens(int n) {
        
//         char[][] board = new char[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 board[i][j] = '.';
//             }
//         }
//         List<List<String>> res = new ArrayList<List<String>>();
//         func(0,board,res,n);
//         return res;
//     }
// }

 
import java.util.List;

class Solution {
    public static void func(int col, char[][] board, ArrayList<List<String>> res, int n, int[] upperDiagonal, int[] leftRow, int[] lowerDiagonal) {

        if (col == board.length) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < n; row++) {

            if (upperDiagonal[n - 1 + row - col] == 0 && leftRow[row] == 0 && lowerDiagonal[row + col] == 0) {

                board[row][col] = 'Q';
                upperDiagonal[n - 1 + row - col] = 1;
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;

                func(col + 1, board, res, n, upperDiagonal, leftRow, lowerDiagonal);

                // Backtrack
                board[row][col] = '.';
                upperDiagonal[n - 1 + row - col] = 0;
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
            }
        }
    }

    public static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }

    public static ArrayList<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        ArrayList<List<String>> res = new ArrayList<>();
        int[] upperDiagonal = new int[2 * n - 1];
        int[] leftRow = new int[n];
        int[] lowerDiagonal = new int[2 * n - 1];

        func(0, board, res, n, upperDiagonal, leftRow, lowerDiagonal);
        return res;
    }

    public static void main(String args[]) {
        int N = 4;
        ArrayList<List<String>> queen = solveNQueens(N);
        int i = 1;
        for (List<String> it : queen) {
            System.out.println("Arrangement " + i);
            for (String s : it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }
    }
}
