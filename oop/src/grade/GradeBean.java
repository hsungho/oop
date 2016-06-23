package grade;

public class GradeBean {
	private int kor,eng,math;
	private String name;
	
	
	public void setKor(int kor){
		this.kor = kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public void setMath(int math){
		this.math = math;
	}
	
	public int getKor(){
		return kor;
	}
	public int getEng(){
		return eng;
	}
	public int getMath(){
		return math;
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "학점 [국어=" + kor + ", 영어=" + eng + ", 수학=" + math + ", 이름=" + name + "]";
	}
	
	
	

}
