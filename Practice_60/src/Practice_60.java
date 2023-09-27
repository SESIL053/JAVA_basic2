import java.util.Scanner;

public class Practice_60 {
	
	public static int whoswin(String com, String user) {
		if(com.equals(user)) 
			return 0;
		
		if(com.equals("가위")) {
			if(user.equals("보"))
				return -1;
			else if(user.equals("바위"))
				return 1;
		}
		
		if(com.equals("바위")) {
			if(user.equals("가위"))
				return -1;
			else if(user.equals("보"))
				return 1;
		}
		
		if(com.equals("보")) {
			if(user.equals("바위"))
				return -1;
			else if(user.equals("가위"))
				return 1;
		}
		
		return 0; // 기본값으로 0 반환
	}

	static String getInput(Scanner sc) throws InvalidInputException {
		String a = sc.next();
		if(!a.equals("가위") && !a.equals("바위") && !a.equals("보")) 
			throw (new InvalidInputException());
		else
			return a;
	}
	
	static String getValidInput() {
		Scanner sc = new Scanner(System.in);
		String a = null;
		
		while(true) {
			try {
				a = getInput(sc);
				return a;
			}
			catch(InvalidInputException e) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				continue;
			}	
		}
	}
	
	public static void main(String[] args) {
		System.out.print("컴퓨터의 생성: ");
		String com = getValidInput();		
		System.out.print("당신의 입력: ");
		String user = getValidInput();

		if(whoswin(com, user) == 0)
			System.out.println("비겼습니다.");
		else if(whoswin(com, user) == 1)
			System.out.println("당신이 이겼습니다.");
		else
			System.out.println("컴퓨터가 이겼습니다.");
		
	}

}
