public class QueenCombinationsQueenRespect{
    static int count = 0;
    public static void main(String[] args){

        queenCombinations(new boolean[4], 0, 2, "", -1);
    }

    static void queenCombinations(boolean[] board, int qpsf, int tq, String ans, int boxIdx){

        if(qpsf == tq){
            System.out.println(++count+" "+ans);
            return;
        }

        for(int i=boxIdx+1; i<board.length; i++){
            board[i] = true;
            queenCombinations(board, qpsf+1, tq, ans+"q"+qpsf+" "+"b"+i+" ", i);
            board[i] = false;
        }
    } 
}