/**
  * 
 */
package controller;



/**
 * @date :2016. 6. 9.
 * @author :황성호
 * @file :MonthEnd.java
 * @story :
 */
public class MonthEnd {
	
 	public static void main(String[] args) {
 		//public int execute(int inputNum1 , int inputNum2){
 		int malil=0,year=0,month=0;
 		System.out.println("년 입력?(예)2016");
 		System.out.println("월 입력?(예)2");
 		switch(month) {
 		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
 		malil = 31;
 			break;
 		case 2:
 		 malil =(year%4==0 &&
 		 			year%100!=0 ||
 		 			year%400==0)?29:28;
 			break;
 		case 4:case 6:case 9:case 11:
 			malil = 30;
 		break;
 		
 		}
 		System.out.printf("%d%s%d%s%d%s",year,"년",month,"월",malil,"일");
 		
 		}
 	}
