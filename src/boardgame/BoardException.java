package boardgame;

public class BoardException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	//Contrutor que recebe a mensagem e repassa ao contrutor da class RuntimeException
	public BoardException(String msg) {
		super(msg);
	}

}
