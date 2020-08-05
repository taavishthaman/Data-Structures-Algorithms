class NQueen2{
	static int count = 0;
	public static void main(String[] args){
		nqueen2(new boolean[4][4], 0, 4, "", 0);
	}

	static void nqueen2(boolean[][] board, int qpsf, int tq, String ans, int row){
		
		if(qpsf == tq){
			System.out.println(++count+" ."+ans);
			return;
		}
		if(row == board.length){
			return;
		}
		for(int col=0; col<board[0].length; col++){
			board[row][col] = true;
			nqueen2(board, qpsf+1, tq, ans+"{"+row+","+col+"}", row+1);
			board[row][col] = false;
		}
	}
}