public class QueenCombinationBoxRespect{

    public static void main(String[] args){
        combinationsBoxRespect(new boolean[4], 0, 2, "", 0);
    }

    static void combinationsBoxRespect(boolean[] board, int qpsf, int tq, String ans, int col){

        if(qpsf == tq){
            System.out.println(ans);
            return;
        }

        if(col == board.length){
            return;
        }

        board[col] = true;
        combinationsBoxRespect(board, qpsf+1, tq, ans+"b"+col, col+1);
        board[col] = false;

        combinationsBoxRespect(board, qpsf, tq, ans, col+1);
    }
}