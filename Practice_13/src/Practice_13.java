import java.util.Scanner;

public class Practice_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("컴퓨터의 생성: ");
		String com = sc.next();
		System.out.print("당신의 입력: ");
		String user = sc.next();
		
		if(com.equals(user)) 
			System.out.println("비겼습니다.");
		
		if(com.equals("가위")) {
			if(user.equals("보"))
				System.out.println("컴퓨터가 이겼습니다.");
			else if(user.equals("바위"))
				System.out.println("당신이 이겼습니다.");
		}
		
		if(com.equals("바위")) {
			if(user.equals("가위"))
				System.out.println("컴퓨터가 이겼습니다.");
			else if(user.equals("보"))
				System.out.println("당신이 이겼습니다.");
		}
		
		if(com.equals("보")) {
			if(user.equals("바위"))
				System.out.println("컴퓨터가 이겼습니다.");
			else if(user.equals("가위"))
				System.out.println("당신이 이겼습니다.");
		}

		sc.close();
		
	}

}
