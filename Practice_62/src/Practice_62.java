import java.util.Scanner;

public class Practice_62 {
	
	// 사용자에게 계좌 정보를 입력받아서 매개변수로 받은 배열에 저장
	private static void getAccInfo(Scanner sc, BankAccount[] ba) {
		for(int i = 0; i < 3; i++) {
			ba[i] = new BankAccount();
			System.out.print("예금주 이름을 입력하세요: ");	
			ba[i].setOwner(sc.next());
			System.out.print("잔고를 입력하세요: ");
			ba[i].setBalance(sc.nextInt());
		}
	}

	// 사용자에게 계좌번호를 입력 받아서 반환
	private static int getAccNum (Scanner sc, BankAccount[] ba) throws NoSuchAccountException {
		System.out.print("업데이트할 계좌번호를 입력하세요(종료-0): ");
		int acc = sc.nextInt();
		if(acc > ba.length || acc < 0)
			throw (new NoSuchAccountException());
		else
			return acc;
	}
	
	// 사용자에게 작업 번호를 입력받아서 반환	
	private static int getOperationNum (Scanner sc) throws NoSuchOperationException {
		System.out.print("원하는 작업을 선택하세요(1-입금/2-출금): ");
		int op = sc.nextInt();		
		if(op == 1 || op == 2)
			return op;
		else
			throw (new NoSuchOperationException());
	}
	
	// 배열에 저장된 현재 계좌 상황을 화면에 출력
	public static void printAccInfo(BankAccount[] b) {
		System.out.println("현재 잔고 현황입니다.");
		System.out.println("계좌번호\t계좌주\t잔고");
		for(int i = 0; i < 3; i++) 
			System.out.println((i + 1) + "\t" + b[i].toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount[] ba = new BankAccount[3];
		getAccInfo(sc, ba);
		printAccInfo(ba);
		
		while(true) {
			try {
				int acc = getAccNum(sc, ba);
				if(acc == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
				int op = getOperationNum(sc);
				if(op == 1) {
					System.out.print("입금액을 입력하세요: ");
					ba[acc - 1].deposit(sc.nextInt());
					System.out.println("입금이 완료되었습니다.");
					printAccInfo(ba);
				}
				else {
					System.out.print("출금액을 입력하세요: ");
					ba[acc - 1].withdraw(sc.nextInt());	
					System.out.println("출금이 완료되었습니다.");
					printAccInfo(ba);
				}
			}
			catch(NoSuchAccountException e) {
				System.out.println("잘못된 계좌번호입니다. 다시 입력하세요.");
				printAccInfo(ba);
				continue;
			}
			catch(NoSuchOperationException e) {
				System.out.println("잘못된 작업입니다. 다시 입력하세요.");
				printAccInfo(ba);
				continue;
			}
			catch(NegativeBalanceException e) {
				System.out.println("입력된 금액이 잘못되었습니다. 다시 입력하세요.");
				printAccInfo(ba);
				continue;
			}
		}

		sc.close();

	}

}
