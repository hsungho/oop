/**
 * 
 */
package kaup;



/**
 * @date : 2016. 6. 10.
 * @author : 황성호
 * @file :Kaup2.java
 * @story :카우푸 지수 구하는 프로그램
 * 
 */
public class Kaup2 {
	String name,height,weight;
	
	public void setName(String name){//write
		this.name = name;
		
	}
	public void setHeight(String height){
		this.height = height;
	}
	public void setWeight(String weight){
		this.weight = weight;
	}
	public String getname(){
		return this.name;
	}
	public String getHeight(){
		return this.height;
	}
	public String getweight(){
		return this.weight;
	}
	

		
		
	
	public String  execute () {
		
		String  result = "";
		double kaup = 0.0, height = Double.parseDouble(this.height),
				weight = Double.parseDouble(this.weight);
		
		kaup = weight / (height / 100) / (height / 100);

		if (kaup < 18.5) {
			result = "저체중";
		} else if (kaup >= 18.6 && kaup <= 22.9) {
			result = "정상체중";
		} else if (kaup >= 23.0 && kaup <= 24.9) {
			result = "위험체중";
		} else if (kaup >= 25.0 && kaup <= 29.9) {
			result = "비만1단계";
		} else if (kaup >= 30 && kaup <= 39.9) {
			result = "비만2단계";
		} else if (kaup >= 40) {
			result = "비만 3단계";
		}
		
		double d = Double.parseDouble(String.format("%.2f", kaup));
		return name + "님은kaup지수는"+d+
				"이고" + result+"이다";
			
	}

}
