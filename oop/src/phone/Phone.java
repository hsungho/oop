package phone;

public class Phone {
	private String company,call;
	public final static String KIND = "유선전화기";
	

	
	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getCall() {
		return call;
	}


	
	public void setCall(String call) {
		this.call = call;
	}


	public static String getKind() {
		return KIND;
	}


	
	@Override
	public String toString() {
		return KIND+"인" + company + "제품을가지고," + call + "(이)라고 통화했다";
	}

	
	
}
