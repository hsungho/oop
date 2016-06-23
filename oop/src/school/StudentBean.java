/**
 * 
 */
package school;

/**
 * @date   : 2016. 6. 16.
 * @author : 황성호
 * @file   :Student.java
 * @story  :
 
 */
public class StudentBean {
	
	private String pw,regDate,name,gender,id,ssn;//남 m 여  w


	
	
	
	
	
	public StudentBean(String id,String pw,String name,String ssn){
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.ssn = ssn;
		this.gender = null;
		this.regDate=regDate;
		 
		 String[] arr=new String[2]; 
			arr=ssn.split("-");
			if (Integer.parseInt(arr[1])==0||Integer.parseInt(arr[1])==9) {
				System.out.println("다시입력해주세요(0또는9입력불가)");
				return;
			}
			
	switch (Integer.parseInt(arr[1])%2) {
	case 1:
		this.gender = "남";
		break;
	
		
	default:
		this.gender = "여";
		break;
	}
		
}
	
	
	
	public void setPw(String pw){
		this.pw = pw;
	}
	public void setRegdate(String regdate){
		this.regDate = regdate;
	}
	
	
	
	
	
	public String getid(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public String getGender(){
		return this.gender;
	}
	public String getpw(){
		return this.pw;
	}
	public String getregDate(){
		return this.regDate;
	}
	public String getSsn(){
		return this.ssn;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "학생 [비번=" + pw + ", 등록일=regDate=" + regDate + ",이름=name=" + name + ", 성별gender=" + gender + ", 아이디=" + id
				+ ", 주민번호=" + ssn + "]";
	}
	
}
