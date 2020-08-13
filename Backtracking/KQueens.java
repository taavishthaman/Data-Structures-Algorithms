public class KQueens{
    public static void main(String[] args){
        kQueens(new boolean[4][4], 0, 3, "", 0);
    }   

    static void kQueens( boolean board[][], int qpsf, int tq, String ans, int row){

        if(qpsf == tq){
            System.out.println(ans);
            return;
        }

        if(row == board.length){
            return;
        }

        for(int col=0; col<board[0].length; col++){
            if(isItSafe(board, row, col)){
                board[row][col] = true;
                kQueens(board, qpsf+1, tq, ans+"{"+row+","+col+"}", row+1);
                board[row][col] = false;
            }
        }

        kQueens(board, qpsf, tq, ans, row+1);
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