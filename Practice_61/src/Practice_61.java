import java.util.Scanner;

public class Practice_61 {
	
	public static void printAll(BankAccount[] b) {
		System.out.println("현재 잔고 현황입니다.");
		System.out.println("계좌번호\t계좌주\t잔고");
		for(int i = 0; i < 3; i++) 
			System.out.println((i + 1) + "\t" + b[i].toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount[] bList = new BankAccount[3];
		
		for(int i = 0; i < 3; i++) {
			bList[i] = new BankAccount();
			System.out.print("예금주 이름을 입력하세요: ");	
			bList[i].setOwner(sc.next());
			System.out.print("잔고를 입력하세요: ");
			bList[i].setBalance(sc.nextInt());
		}
		
		printAll(bList);
		
		while(true) {
			System.out.print("업데이트할 계좌번호를 입력하세요(종료-0): ");
			int c1 = sc.nextInt();
			
			if(c1 == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("원하는 작업을 선택하세요(1-입금/2-출금): ");
			int c2 = sc.nextInt();
			
			if(c2 == 1) {
				System.out.print("입금액을 입력하세요: ");
				bList[c1 - 1].deposit(sc.nextInt());
				System.out.println("입금이 완료되었습니다.");
				printAll(bList);
			}
			else {
				try {
					System.out.print("출금액을 입력하세요: ");
					bList[c1 - 1].withdraw(sc.nextInt());	
					System.out.println("출금이 완료되었습니다.");
				}
				catch(NegativeBalanceException e) {
					System.out.println("입력된 금액이 잘못되었습니다. 다시 입력하세요.");
				}
				printAll(bList);
			}	
		}
		
		sc.close();

	}

}
