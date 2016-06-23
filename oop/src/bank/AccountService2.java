/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

import com.sun.management.GarbageCollectionNotificationInfo;

import sun.management.GarbageCollectionNotifInfoCompositeData;

/**
 * @date   : 2016. 6. 20.
 * @author : 황성호
 * @file   :AccountServise.java
 * @story  :
 
 */
public class AccountService2 {
	//1통장개설 2,입금 3,조회 4,출금 5,통장내역 6,해지
	AccountBean account;
	//1개설
	public void openAccount(String name,String id ,String pw){
		account = new AccountBean(name,id,pw);
	}
	
	//2,입금
	public void deposit(int inputMoney){
	 int money = account.getMoney();
	 money+=inputMoney;
	 account.setMoney(money);
	    }
	     //3,조회
		public void find(){
		}
		
	    //4,출금
	    public String withdraw(int output){
	        String result = "잔액부족";
	    	int money = account.getMoney();
	        if (output <= money) {
                   money -= output;
                   account.setMoney(money);
               result = String.valueOf(account.getMoney());
	        }	
		return    result;
	    	
	    }
	    //5,통장내역
	    public String showAccount(){
	    	
	    	return account.toString();
	    }



	    //6해지
	public void deleteAccount(){
	     account = null;
	}
	}