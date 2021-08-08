
public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		rotate(data);
		printImage(data);
	}

	private static void printImage(int[][] data) {
		for(int i=0; i< data.length; i++) {
			for(int j=0 ; j<data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void rotate(int[][] data) {
		for(int i=0; i< data.length; i++) {
			for(int j=i ; j<data[i].length; j++) {
				int temp = data[i][j];
				data[i][j] = data[j][i];
				data[j][i] = temp;
			}
		}
		
		for(int i=0; i< data.length; i++) {
			for(int j=0,k = data[i].length-1; j<k; j++, k--) {
				int temp = data[i][j];
				data[i][j] = data[i][k];
				data[i][k] = temp;
			}
		}
	}

}
