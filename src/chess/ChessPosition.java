package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	
	/*Esse m�todo faz um teste para saber se a column < char 'a' ou column > 'h' ou row < 1 ou row > 8, 
	  se acontecer algo desse tipo, ele nao aceita a instancia�ao do chessPosition e lan�a a exception*/
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instatiating ChessPosition. valid values are from a1 to h8");
		}		
		this.column = column;
		this.row = row;
	}

	public int getRow() {
		return row;
	}	

	public char getColumn() {
		return column;
	}
	
	//Esse m�todo converte a ChessPosition para o position normal do xadrez 
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	//Esse m�todo faz a conversao inversa position para o ChessPosition
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	//Imprimindo na ordem
	@Override
	public String toString() {
		return "" + column + row;
	}
	
	
}
