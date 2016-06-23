
package grade;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 8.
 * @author : 황성호
 * @file :Avg.java
 * @story :
 * 
 */
public class GradeController {
	/**
	 * 클라이언트에서 프로그램 개발 요청이왔습니다. 이름과 국,영,수 세과목점수를 입력받아서 [홍길동 : 총점 ***점,평균***점,학점
	 * : f] 을 출력하는 프로그램을 만들어 주세요. 단) 평균은 소수점이하는 절삭합니다 평균점수가 90점 이상 a 80점 이상이면 b
	 * 70점 이상이면 c 60점 이상이면 d 50점 이상이면 e 50점 미만이면 f 학점입니다라고 출력되게 해주세요 미만이면 불합격,
	 * 이상이면 합격입니다 [단]switch-case 문으로 해결하세요
	 */
	public static void main(String[] args) {
		String name = "", grade = "";
		int kor = 0, eng = 0, math = 0, total = 0, avg = 0;
		GradeService service = new GradeServiceImpl(); 
		while (true) {
			switch (JOptionPane.showInputDialog("go(1)?")) {
			case "1":
				String input=JOptionPane.showInputDialog("이름,국어,영어,수학");
				String[] arr=input.split(",");
				name= arr[0];
				kor = Integer.parseInt(arr[1]);
				eng = Integer.parseInt(arr[2]);
				math= Integer.parseInt(arr[3]);
				total=service.total(kor, eng, math);
				avg = service.avg(total);
				grade=service.grade(avg);
				JOptionPane.showMessageDialog(null, "이름:"+name+"성적:"+grade);
				break;
				
			default:return;
			}

		}
	}

}