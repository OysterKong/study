package main;

public class Account {

	private int balance;
	
	//Alt + Shift + R ( 바꾸고 싶은 이름 뒤에 커서를 놓고 3 키를 누른뒤 변경하면 동일한 이름이 전부 바뀜 )
	public Account(int money) {
		this.balance = money;
	}

	public int getBalance() {
		// TODO 잔고 조회용 메서드
		return balance;
	}

	public void deposit(int money) {
		// TODO 계좌 입금 기능
		balance += money;
	}

	public void Withdraw(int money) {
		// TODO 계좌 출금 기능
		balance -= money;
	}

}
