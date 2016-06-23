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
      int ok =0;
      AccountService service = new AccountServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("1개설 2,입금 3,조회 4,출금 5,통장내역 6,종료")) {
			case "1":
				String spec = JOptionPane.showInputDialog("이름,id,pw");
				String[] specArr = spec.split(",");
				service.openAccount(specArr[0],specArr[1],specArr[2]);
				 break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액");
				service.deposit(Integer.parseInt(inputMoney));
				break;
			case "3":
				//JOptionPane.showMessageDialog(null, account.getMoney());
				break;
			case"4":
				String outputMoney = JOptionPane.showInputDialog("출금액");
			service.withdraw(Integer.parseInt(outputMoney));
				break;
			case "5":
				JOptionPane.showMessageDialog(null,service.showAccount());
				break;
			default:
				JOptionPane.showConfirmDialog(null, "close, ok");
				return;
			}

		}
	}

}
