package object_class;

import ExceptionEx.InsufficientException;

//은행계좌 클래스
public class Account {
	//멤버변수(필드)
	static final String bankname="신한";
	String accountNo; //계좌번호 필드 ('-'가 들어가므로 string)
	String ownerName; //예금주이름
	int balance; //잔액
	//메서드(기능)
	//예금한다 메서드
	
	/* int a; //a는 정수 받는 변수임을 선언
	int a=5; //동시에 a=5 값 부여=초기화 */
	
	//생성자
/*	public Account(String accNo, String owName, int bal) {
		accountNo=accNo; 
		ownerName=ownerName;
		int balance=bal; */
	
	public Account() {
		this.accountNo=accountNo; //this는 매번 명명 귀찮으므로 필드=멤버변수 이름일 때 this 붙임
		this.ownerName=ownerName;
		this.balance=balance;
		
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		// TODO Auto-generated constructor stub
	}

	//예금한다 메서드(클래스의 기능)
	void deposit(int amount) { //void : 메서드 내용 수행. 리턴값 없다 deposit : 메소드 이름
	balance+=amount; //balance=balance+amount; 매개변수는 외부에서 값을 받은 변수 ex. AccountEx01의 deposit 500 저장
	}
	//인출한다 메서드
	int withdraw(int amount) throws InsufficientException { //withdraw : 메소드 이름. int(타입) 예외처리withdraw(int amount) throws exception 문 외우기
		if(balance < amount) { //100<500 : X
			throw new InsufficientException("잔액부족("+(amount-balance)+"모자람)"); //이 조건에서만 메시지 던진다
		} 
		balance-=amount; //balance=balance-amount;
		return amount; //찾는 돈 돌려주는
	}
}
