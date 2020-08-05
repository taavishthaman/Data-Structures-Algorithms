class NKnights{
	static int count = 0;
	public static void main(String[] args){
		NKnights(new boolean[3][3], 0, 0, 0, 3, "");
	}

	static void NKnights(boolean[][] board, int row, int col, int kpsf, int tk, String ans){
		
		if(kpsf == tk){
			printBoard(row, col, board);
			System.out.println(++count+"."+ans);
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
			NKnights(board, row, col+1, kpsf+1, tk, ans+"{"+row+","+col+"}");
			board[row][col] = false;
		}

		NKnights(board, row, col+1, kpsf, tk, ans);
		
	}

	static boolean isItSafe(boolean[][] board, int row, int col){
		
		int[] rowArr = {-1, -2, -2, -1};
		int[] colArr = {-2, -1, 1, 2};

		for(int i=0; i<4; i++){
			int r = row+rowArr[i];
			int c = col+colArr[i];

			if(r >= 0 && r < board.length && c >= 0 && c < board[0].length){
				if(board[r][c]){
					return false;
				}
			} 
		}
		return true;
	}
	
	static void printBoard(int row, int col, boolean[][] board){

		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[0].length; j++){
				if(board[i][j] == true){
					System.out.print('K');
				}
				else{
					System.out.print('.');
				}
			}
			System.out.println();
		}
	}
}