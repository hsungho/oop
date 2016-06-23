package school;

public class StudentServiceImpl implements StudentService{
     StudentBean student;
	
     @Override// 1 등록
	public void registStudent(String id, String pw, String name, String ssn) {
		// 1 등록
	     student= new StudentBean(id, pw, name, ssn);
	}
                                                 
	@Override// 2 보기
	public String showStudent() {
		
		return student.toString();
		
		
	}

	@Override// 3 수정
	public void updateStudent(String pw) {
		student.setPw(pw);
		
	}

	@Override// 4 삭제
	public void deleteStudent() {
		student = null;
		
	}

}
