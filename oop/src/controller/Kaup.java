/**
 * 
 */
package controller;


/**
 * @date   :2016. 6. 10. 
 * @author :황성호
 * @file   :Kaup2.java
 * @story  :카우푸지수 구하는 프로그램
*/
public class Kaup {
	
		public String execute(String name,String h, String w) {
			
		String name1=name;
		String result="";
		double kaup = 0.0, height = Double.parseDouble(h )
				, weight=Double.parseDouble( w);
		
	
		
		kaup = weight / (height / 100) / (height / 100);
		
		if (kaup < 18.5) {
			result = "저체중";
		}else if(kaup < 22.9 && kaup > 18.5){
			result = "정상";
		}else if(kaup < 24.9 && kaup > 23.0){
			result = "위험체중";
		}else if(kaup < 29.9 && kaup > 25.0){
			result = "비만1단계";
		}else if(kaup < 40 && kaup > 30.0){
			result = "비만2단계";
		}else if(kaup >= 40){
			result = "비만3단계";
		}
		double d = Double.parseDouble(String.format("%.2f", kaup));
		return name1 +"은 BMI지수는 "+d+"이고,"+result+"이다";
		
	}
	
}
