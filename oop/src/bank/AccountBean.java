/**
 * 
 */
package bank;

import global.MyConstants;

/**
 * @date   : 2016. 6. 16.
 * @author : 황성호
 * @file   :accountNoNO.java
 * @story  :
 
 */
public class AccountBean {
	private int accountNo; //인스턴스 변수는 초기화를 하지 않는다
	private String name;
	private int money;
	
	private String pw;
	private String id;
	
	public AccountBean(){
		//생성자 오버로드
	}
	
	
	
	public AccountBean(String name,String id,String pw) {
		this.accountNo = (int)(Math.random() * 999999)+100000;
		this.name = name;
        this.id = id;
        this.pw = pw;
	}
	
    
 
    public void setMoney(int money){
    	this.money = money;
    }
   
    public void setPw(String pw){
    	this.pw = pw;
    }
    public void setID(String id){
    	this.id = id;
    }
    public int getaccountNo(){
    return	this.accountNo;
    }
    public String getName(){
    return	this.name; 
    }
    public int getMoney(){
    	return	this.money;
    }
   
    public String getPw(){
    	return	this.pw;
    }
    public String getID(){
    	return	this.id; 
    }
   
	public String toString() {
		return MyConstants.Bank_Name+" [계좌번호=" + accountNo + ", 이름=" + name + ", 금액=" + money + ", 비번=" + pw + ", 아이디=" + id
				+ "]";
	}
    
    
    
    
    
    
    
}
