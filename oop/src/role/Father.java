package role;

/**
 * @date   : 2016. 6. 22.
 * @author : 황성호
 * @file   :Father.java
 * @story  :
 
 */
public class Father extends Man{
	@Override
	public void role() {
		System.out.println("아버지의 역활");
	}
	
       public void worry(){
    	   System.out.println("아버지의 고민");
       }
}
