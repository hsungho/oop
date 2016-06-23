package role;

/**
 * @date   : 2016. 6. 22.
 * @author : 황성호
 * @file   :Employee.java
 * @story  :
 
 */
public class Employee extends Man{
	@Override
	public void role() {
		System.out.println("직원의 역활");
		
	}

    public void worry(){
 	   System.out.println("직원의 고민");
    }

}
