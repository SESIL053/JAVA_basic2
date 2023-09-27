import java.util.Scanner;

public class Practice_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String com;
		String user;
		
		while(true) {
			System.out.print("컴퓨터의 생성: ");
			com = sc.next();
			
			if(!com.equals("가위") && !com.equals("바위") && !com.equals("보")) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				continue;
			}
			
			break;
		}
		
		while(true) {
			System.out.print("당신의 입력: ");
			user = sc.next();
			
			if(!user.equals("가위") && !user.equals("바위") && !user.equals("보")) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				continue;
			}
			
			break;
		}		

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
