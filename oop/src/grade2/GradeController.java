
package grade2;

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
	public static void main(String[] args) {
		String name="", grade="";
		int kor=0,eng=0,math=0,avg=0,total=0;
		GradeService service = new GradeServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("1등록2종료")) {
			case "1":
				String input=JOptionPane.showInputDialog("이름,국어,영어,수학");
				String[] arr=input.split(",");
				name=arr[0];
				kor=Integer.parseInt(arr[1]);
				eng=Integer.parseInt(arr[2]);
				math=Integer.parseInt(arr[3]);
				
				break;

			default:
				break;
			}
			
		}
	}

}