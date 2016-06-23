package phone;

/**
 * @date   : 2016. 6. 22.
 * @author : 황성호
 * @file   :IPhone.java
 * @story  :
 
 */
public class IPhone extends CelPhone {
	private String date;
	public final static String KIND = "스마트폰";
    public final static String BRAND ="아이폰";
	
    
    public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return KIND+"이기 때문에"+super.getMove()+","
	+ super.getCompany() + "제품을가지고," 
	+ super.getCall() + "(이)라고 통화하고,"
	+this.getDate()+"를 문자로 보냈다";
	}
	
    
}
