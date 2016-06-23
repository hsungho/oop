package grade2;

public class GradeBean {
	private int kor,eng,math;
	private String name;
	
	public void setKOR(int kor){
		this.kor=kor;
	}
	public void setEng(int eng){
		this.eng=eng;
	}
	public void setMath(int math){
		this.math=math;
	}
	public int getkor(){
		return kor;
		
	}
	public int geteng(){
		return eng;
	}
	public int math(){
		return math;
	}
	public String name(){
		return name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GradeBean [kor=" + kor + ", eng=" + eng + ", math=" + math + ", name=" + name + "]";
	}
	
	
	
}
