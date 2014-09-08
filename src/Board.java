
public class Board {
	static char[][] board;
	public static void main(String args[]){
		board = new char[6][7];
		fillBoard();

	}
	private static void fillBoard(){
		char blank = '#';
		for (int row=0; row<6; row++){
			for(int col=0; col<7; col++){
				board [row][col]= blank;	
			}	
		}
		printBoard(board);
	}

	private static void printBoard (char [][] brd){

		for (int row=0; row<6; row++){
			for(int col=0; col<7; col++){
				System.out.print (brd[row][col]);

			}
			System.out.println ();
		}
	}
}


