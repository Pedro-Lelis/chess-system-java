package boardgame;

public class Board {
	
	private Integer rows;
	private Integer collumns;
	private Piece[][] pieces;
	
	
	public Board(Integer rows, Integer collumns) {
		this.rows = rows;
		this.collumns = collumns;
		pieces = new Piece[rows][collumns];
	}
	
	
}
