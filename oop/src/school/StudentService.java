/**
 * 
 */
package school;

/**
 * @date   : 2016. 6. 17.
 * @author : 황성호
 * @file   :StudentService.java
 * @story  :
 
 */
public interface StudentService {
	//등록
	public void registStudent(String id,String pw,String name,String ssn);
	//보기
	public String showStudent();
	//수정
	public void updateStudent(String pw);
	public void deleteStudent();
	

}
