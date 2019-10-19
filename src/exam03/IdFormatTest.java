package exam03;

/**
 * 사용자 정의 예외 테스트
 * @author sykim
 *
 */
public class IdFormatTest {

	private String userId;

	public String getuserId(){
		return userId;
	}

	public void setuserId(String userId) throws IdFormatException{

		if(userId == null){
			throw new IdFormatException("아이디는 null 일 수 없습니다");
		}
		else if( userId.length() < 8 || userId.length() > 20){
			throw new IdFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
		}

		this.userId = userId;
	}

	public static void main(String[] args) {

		IdFormatTest test = new IdFormatTest();
		String userId = null;
		try {
			test.setuserId(userId);
		} catch (IdFormatException e) {
			System.out.println(e.getMessage());
		}

		userId = "1234567";
		try {
			test.setuserId(userId);
		} catch (IdFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
