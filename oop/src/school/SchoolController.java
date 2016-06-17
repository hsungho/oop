/**
 * 
 */
package school;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 16.
 * @author : 황성호
 * @file :SchoolController.java
 * @story :1,등록 ssn 아이디 비번 이름 2번조회 홍길동,id,남
 * 
 * 
 */
public class SchoolController {
	public static void main(String[] args) {
		Student s = null;
		while (true) {
			switch (JOptionPane.showInputDialog("1등록 2조회 0종료")) {
			case "1":
				String id = JOptionPane.showInputDialog("id");

				String pw = JOptionPane.showInputDialog("pw");
				String name = JOptionPane.showInputDialog("이름");
				String ssn = JOptionPane.showInputDialog("주민번호");
				s = new Student(id, pw, name, ssn,null);
				
				break;
			case "2":
				JOptionPane.showMessageDialog(null,s.getid() + s.getName() + s.getGender());
				return;
			case "3":
			case "0":
				JOptionPane.showConfirmDialog(null, "close, ok");
				return;

			default:
				break;
			}
		}
	}

}
