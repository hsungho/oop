package phone;

/**
 * @date   : 2016. 6. 22.
 * @author : 황성호
 * @file   :AndroidPhone.java
 * @story  :
 
 */
public class AndroidPhone extends IPhone{
	 public final static String BRAND ="갤럭시노트";
     private String size,date;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String call ,String size,String date) {
		super.setCompany(BRAND);
		super.setPortable(true);
		super.setCall(call);
		this.setSize(size);
		this.date = 
				 KIND+"이기 때문에"
		                    +super.getMove()+","
							+ super.getCompany() + "제품을가지고\n"
							+ super.getCall() + "(이)라고 통화하고\n,"
							+this.getSize()+"인치 큰화면을 통해서\n"
							+"카톡으로"+date+"메시지 전달했다";
	}
	@Override
	public String toString() {
		return getDate();
	}
}
