/**
 * 
 */
package bank;


/**
 * @date   : 2016. 6. 20.
 * @author : 황성호
 * @file   :AccountServicImpl.java
 * @story  :계좌 인터페이스
 
 */
public class AccountServiceImpl implements AccountService {
	//1통장개설 2,입금 3,조회 4,출금 5,통장내역 6,해지
	AccountBean account;

	@Override
	public void openAccount(String name, String id, String pw) {
		//개설
		account = new AccountBean(name,id,pw);
	}

	
	@Override//입금
	public void deposit(int inputMoney) {
		 int money = account.getMoney();
		 money+=inputMoney;
		 account.setMoney(money);
		
	}

	
	@Override
	public void find() {
		//조회public void find(){
		
	}

	
	@Override
	public String withdraw(int output) {
		   String result = "잔액부족";
	    	int money = account.getMoney();
	        if (output <= money) {
                  money -= output;
                  account.setMoney(money);
              result = String.valueOf(account.getMoney());
		     
	        }
	        return result;
	}


	@Override
	public String showAccount() {
		    	
		    	return account.toString();
			}


	@Override
	public void deleteAccount() {
		
		     account = null;
		
	}

}
