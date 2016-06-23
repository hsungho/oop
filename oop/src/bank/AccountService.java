/**
 * 
 */
package bank;

/**
 * @date   : 2016. 6. 20.
 * @author : 황성호
 * @file   :AccountService.java
 * @story  :
 
 */
public interface AccountService {
	//1통장개설 2,입금 3,조회 4,출금 5,통장내역 6,해지
		
	     //1개설
		public  abstract void openAccount(String name,String id ,String pw);
		 //2,입금
		public void deposit(int inputMoney);
		 //3,조회
	    public void find();
		 //4,출금
		public String withdraw(int output);
		 //5,통장내역
		public String showAccount();
		//6해지
		public void deleteAccount();
		}

