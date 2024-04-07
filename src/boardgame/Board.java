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


	public Integer getRows() {
		return rows;
	}


	public void setRows(Integer rows) {
		this.rows = rows;
	}


	public Integer getCollumns() {
		return collumns;
	}


	public void setCollumns(Integer collumns) {
		this.collumns = collumns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
}
