public class QueenCombination2D{

    public static void main(String[] args){
        queenCombination2D(new boolean[2][2], 0, 2, 0, 0, "");
    }

    static void queenCombination2D(boolean[][] board, int qpsf, int tq, int row, int col, String ans){

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

        board[row][col] = true;
        queenCombination2D(board, qpsf+1, tq, row, col+1, ans+"("+row+","+col+")");
        board[row][col] = false;

        queenCombination2D(board, qpsf, tq, row, col+1, ans);
    }
}