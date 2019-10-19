package exam03;

public class IdFormatException extends Exception{

	private static final long serialVersionUID = -6839133404533706829L;

	/**
	 * 사용자 정의 예외 구현
	 * @author sykim
	 */
	public IdFormatException(String message){
		super(message);
	}
}
