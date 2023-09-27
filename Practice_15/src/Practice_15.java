import java.util.Scanner;

public class Practice_15 {
	
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("컴퓨터의 생성: ");
		String com = sc.next();
		System.out.print("당신의 입력: ");
		String user = sc.next();
		
		if(whoswin(com, user) == 0)
			System.out.println("비겼습니다.");
		else if(whoswin(com, user) == 1)
			System.out.println("당신이 이겼습니다.");
		else
			System.out.println("컴퓨터가 이겼습니다.");
		
		sc.close();
		
	}

}
