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
		StudentService service = new StudentServiceImpl();
		
		while (true) {
			switch (JOptionPane.showInputDialog("1등록 2보기 3 수정 4 삭제 0종료")) {
			case "1":
				String spec = JOptionPane.showInputDialog("id,pw,이름,주민번호");
				String[] specArr = spec.split(",");
				service.registStudent(specArr[0],specArr[1],specArr[2],specArr[3]);
				
				break;
			case "2":
				JOptionPane.showMessageDialog(null,service.showStudent());
				break;
			case "3":
				
			 service.updateStudent(JOptionPane.showInputDialog("pw다시입력"));
			break;
			case"4":
			service.deleteStudent();
				
				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "close, ok");
				return;

			default:
				break;
			}
		}
	}

}
