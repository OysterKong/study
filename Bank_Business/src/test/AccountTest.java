package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Account;

public class AccountTest {
	private Account account;
	
	@Before
	public void setUp() {
		account = new Account(10000);
		System.out.println("setup");
	}
	
	@Test
	public void testAccount() throws Exception {
		setUp();
	}
	
	@Test
	public void testGetBalance() throws Exception{
		setUp();
		assertEquals("10000원으로 계좌생성", 10000, account.getBalance());
		
//		if(account.getBalance() != 10000) {
//			fail("잔고 조회 =>" + account.getBalance());  //JUnit 에서 제공하는 기능
//		}
		
		
		account = new Account(1000);
		assertEquals(1000, account.getBalance());
//		if(account.getBalance() != 1000) {
//			fail("잔고 조회 =>" + account.getBalance());  //JUnit 에서 제공하는 기능
//		}
		
		account = new Account(0);
		assertEquals(0, account.getBalance());
//		if(account.getBalance() != 0) {
//			fail("잔고 조회 =>" + account.getBalance());  //JUnit 에서 제공하는 기능
//		}

	}
	
	@Test
	public void testDeposit() throws Exception {
		setUp(); //통장개설 후 10000원 넣고
		account.deposit(1000); //1000원 입금
		assertEquals(11000, account.getBalance()); //기존 10000원에 1000원 입금했으니 11000원인지 비교
	}
	
	@Test
	public void testWithdraw() throws Exception {
		setUp(); //통장개설 후 10000원 넣고
		account.Withdraw(1000); //1000원 출금
		assertEquals(9000, account.getBalance()); //기존 10000원에 1000원 출금했으니 9000원인지 비교
	}
	
}




//기존 테스트 코드

//public class AccountTest {
//	public void testAccount() throws Exception {
//		Account account = new Account(); 
//		
//		if(account == null) {
//			throw new Exception("계좌 생성 실패");
//		}
//	}
//	public static void main(String[] args) {
//		AccountTest test = new AccountTest();
//		try {
//			test.testAccount(); //테스트 케이스 실행
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("실패(X)");
//			return;
//		}
//		System.out.println("성공(O)");
//	}
//}
