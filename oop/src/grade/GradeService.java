package grade;

public interface GradeService {
	public abstract int total(int kor,int eng, int math);
	public int avg(int total);
	public String grade(int avg);

}
