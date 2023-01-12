package date_0930;
import java.util.Scanner;

public class BankApp {// 은행 앱 (기능)
	
	Account[] acc = new Account [100];   //멤버변수(참조형변수)
	Scanner sc = new Scanner(System.in);             //  "
	                                                 //참조형의 기본값은  다 null
	void info(){
		System.out.println("---------------------------------");
		System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
		System.out.println("---------------------------------");
		System.out.println("선택: ");
	}
	//계좌생성기능
	void createAccount(){
		System.out.println("----------");
		System.out.println("계좌 생성 메뉴");
		System.out.println("----------");
		
		System.out.println("계좌번호: ");
		String ano = sc.next();
		
		if(findAccount(ano) != null) {
	    	System.out.println("계좌번호가 이미 존재합니다");
	    	return; 
	    }
		
		System.out.println("계좌주명: ");
		String owner = sc.next();
		
		System.out.println("초기입금액: ");
		int balance = sc.nextInt();
		
		System.out.println("이자율 입력: ");
	    double rate = sc.nextDouble();
	    
		
		Account account = new Account(ano,owner,balance,rate);
		
		// 이자율 
		account.rateCal();
		
		
		for(int i = 0; i<acc.length; i++) {
			if(acc[i] == null) {
				acc[i] = account;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	
	//계좌목록보기 기능
	void accountList(){
		System.out.println("-------------");
		System.out.println("계좌 목록 보기 메뉴");
		System.out.println("-------------");
		
		System.out.println("계좌번호   계좌주    입금액      이자율     출금가능액");
		
		for(int i = 0; i<acc.length; i++){
			if(acc[i] == null) {
				break;
			}
			System.out.println(" "+acc[i].getAno()+"    "+acc[i].getOwner()+"   "+acc[i].getBalance()+"   "+acc[i].getRate()+"%    "+acc[i].getAmount());
		} // "\t" 는  넓은 띄어쓰기(?)
		
	}
	
	//예금 기능
		void deposit(){
			System.out.println("-----------");
			System.out.println("예금 기능 메뉴");
			System.out.println("-----------");
		
		    System.out.println("계좌번호: ");
		    String ano = sc.next();
		    
		    System.out.println("예금액: ");
		    int balance = sc.nextInt();
		    
		    //완성하기
		    
		    Account account = findAccount(ano);
		    
		    if(account == null) {
		    	System.out.println("계좌번호가 존재하지않습니다");
		    	return; //함수의 강제 종료 (break는 반복문 종료)
		    }
		    
		   
			account.setBalance(account.getBalance() + balance);
			System.out.println("예금 처리가 정상적으로 되었습니다.");
		    
		}
		
		//출금 기능
		
		void withdraw(){
			System.out.println("-----------");
			System.out.println("출금 기능 메뉴");
			System.out.println("-----------");
			
			System.out.println("계좌번호: ");
		    String ano = sc.next();
		    
			System.out.println("출금액: ");
		    int balance = sc.nextInt();
		
           Account account = findAccount(ano);
		    
		    if(account == null) {
		    	System.out.println("계좌번호가 존재하지않습니다");
		    	return; //함수의 강제 종료 (break는 반복문 종료)
		    }
		   
		    if(account.getBalance() < balance) {
		    	System.out.println("예금액이 부족합니다.");
		    	return;
		    }
		   
			account.setBalance(account.getBalance() - balance);
			System.out.println("출금 처리가 정상적으로 되었습니다.");
		    
		}
			

		    
	    Account findAccount(String ano) {

		Account account = null;

		for (int i = 0; i < acc.length; i++) {
			if (acc[i] != null) {
				if (acc[i].ano.equals(ano)) {// ano는 문자열 이기에 "=="말고 ".equals"를 쓴다. 뜻은 비슷(?)
					account = acc[i];
					break;
				}
			}
		}
		return account;
	}
	


public static void main(String[] args) {
		
		BankApp ba = new BankApp();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("==================");
		System.out.println("= 은행 업무 관리 시스템 =" );
		System.out.println("==================");
		
		while(true) {//(고객의 선택) 반복이 언제 끝날지 모르니 while로 돌림.
		ba.info();
		
		int choice = sc.nextInt();//1~5 중 선택
		
		if(choice == 1) {
			ba.createAccount();
		}else if (choice == 2) {
			ba.accountList(); 
		}else if (choice == 3) {
			ba.deposit();
		}else if (choice == 4) {
			ba.withdraw();
		}else if (choice == 5) {
			break; 	
		}
	  }
		System.out.println("업무를 종료 합니다.");
	
		
	}

}

