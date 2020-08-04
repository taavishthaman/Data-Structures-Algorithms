public class NQueens{
    public static void main(String[] args){
        nQueens(new boolean[4][4], 0, 0, 0 ,4, "");
    }

    static void nQueens(boolean[][] board, int row, int col, int qpsf, int tq, String ans){

        if(qpsf == tq){
            System.out.println(ans);
            return;
        }

        if(col == board[0].length){
            col = 0;
            row++;
        }

        if(row == board.length){
            return;
        }

        if(isItSafe(board, row, col)){
            board[row][col] = true;
            nQueens(board, row+1, 0, qpsf+1, tq, ans+"{"+row+","+col+"}");
            board[row][col] = false;
        }

        nQueens(board, row, col+1, qpsf, tq, ans);
    }

    static boolean isItSafe(boolean[][] board, int row, int col){

        //Check upwards vertically
        int r = row-1;
        int c = col;

        while(r >= 0){
            if(board[r][c]){
                return false;
            }
            r--;
        }

        //Check left

        r = row;
        c = col-1;

        while(c >= 0){
            if(board[r][c]){
                return false;
            }
            c--;
        }

        //Check left diagonal
        r = row-1;
        c = col-1;

        while(r>=0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

        //Check right diagonal
        r = row-1;
        c = col+1;

        while(r>=0 && c < board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }

        return true;
    }
}