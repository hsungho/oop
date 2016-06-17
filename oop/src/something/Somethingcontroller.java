/**
 * 
 */
package something;

import javax.swing.JOptionPane;

/**
 * @date   : 2016. 6. 17.
 * @author : 황성호
 * @file   :Somethingcontroller.java
 * @story  :
 
 */
public class Somethingcontroller {
	public static void main(String[] args) {
		Something s = null;
		while (true){
			switch (JOptionPane.showInputDialog("1 등록 2 조회 0종료")) {
			case "1":
				String aaa = JOptionPane.showInputDialog("aaa");
				String bbb = JOptionPane.showInputDialog("bbb");
				String sccc = JOptionPane.showInputDialog("ccc");
				String sddd = JOptionPane.showInputDialog("ddd");
				int ccc = Integer.parseInt(sccc);
				int ddd = Integer.parseInt(sddd);
				s = new Something(aaa,bbb,ccc,ddd);
				break;
			case"2":
				JOptionPane.showMessageDialog(null,s.getAaa()+s.getBbb()+s.getCcc()+s.getDdd());
				return;
			case"0":
				JOptionPane.showConfirmDialog(null, "close ok?");
				return;
			default:
				break;
			}

}
	}
}
