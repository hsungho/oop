package matrix;

/**
 * @date   : 2016. 6. 22.
 * @author : 황성호
 * @file   :Zigzag.java
 * @story  :
 
 */
public class Zigzag {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int flag=1,k=1,i=0,j=0;
	
		for ( i = 0; i < 5; i++) {
			if (flag == 1) {
				for (j = 0; j < 5; j++){
					mtx[i][i] = k;
					k++;
				}
				
			} else {
				for ( j = 4; j >=0; j--) {
					mtx[i][j] = k;
					k++;
				}
			}
			flag *= -1;
			// 여기를 채우시오(flag 값 방향전환)
		}
		for (i = 0; i < 5; i++) {
		   for (j = 0; j <5; j++) {
			   System.out.print(mtx[i][j]+"\t");
			
		}	
		   System.out.println();
		}

	}

}
