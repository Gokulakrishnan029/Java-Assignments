package assignment;

public class TwoDimensionalArrayAddition {

	public static void main(String[] args) {
		int one[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int two[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int res[][] = new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				res[i][j] = one[i][j] + two[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
