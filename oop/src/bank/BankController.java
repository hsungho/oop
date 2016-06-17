/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

import global.MyConstants;

/**
 * @date : 2016. 6. 15.
 * @author : 황성호
 * @file :accountController.java
 * @story :
 * 
 */
public class BankController {
	public static void main(String[] args) {
		
		Account account =null;
		while (true) {
			switch (JOptionPane.showInputDialog("1통장개설 2,입금 3,조회 4,출금 5,통장내역 6,종료")) {
			case "1":
				int ok = JOptionPane.showConfirmDialog(null, "통장개설?");

				if (ok == 0) {
					
					account = new Account(JOptionPane.showInputDialog("이름:"));
				} else {
					continue;
				}
			
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액");
				account.setMoney(Integer.parseInt(inputMoney));
				break;
			case "3":
				JOptionPane.showMessageDialog(null, account.getMoney());
			case "5":
				JOptionPane.showMessageDialog(null,MyConstants.Bank_Name+ "이름"+account.getName()+"계좌번호:" + account.getaccountNo());
				break;
			default:
				JOptionPane.showConfirmDialog(null, "close, ok");
				return;
			}

		}
	}

}
