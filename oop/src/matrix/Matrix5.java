package matrix;

/**
 * @date   : 2016. 6. 22.
 * @author : 황성호
 * @file   :Matrix5.java
 * @story  :
 
 */
public class Matrix5 {
	public static void main(String[] args) {
		int[][]mtx = new int[5][5];
		int c=0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++ ) {
				c+=5;
				mtx[i][j]=c;
		    System.out.print(mtx[i][j]+"\t");
	       }
			System.out.println();
	
		}
	}
}

