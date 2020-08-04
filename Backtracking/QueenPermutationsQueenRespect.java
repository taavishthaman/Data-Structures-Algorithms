public class QueenPermutationsQueenRespect{

    static int count = 0;
    public static void main(String[] args){

        queenPermutations(new boolean[4], 0, 2, "");
    }

    static void queenPermutations(boolean[] board, int qpsf, int tq, String ans){

        if(qpsf == tq){
            System.out.println(++count + "." +ans);
            return;
        }

        for(int i=0; i<board.length; i++){
            if(board[i] == false){
                board[i] = true;
                queenPermutations(board, qpsf+1, tq, ans+"b"+i+"q"+qpsf);
                board[i] = false;
            }
        }
    }
}