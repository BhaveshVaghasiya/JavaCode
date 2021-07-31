
public class ZeroMoveToEndOfArray {

	public static void main(String[] args) {
		int[] data = { 1, 4, 6, 7, 2, 6, 6, 0, 0, 0, 2, 1, 0, 1, 1, 4, 6, 7, 2, 6, 6 };
		zeroMove(data);
		for (int d : data) {
			System.out.print(d + " ");
		}
	}

	private static void zeroMove(int[] data) {
		for (int i = 0, j = 0; i < data.length && j < data.length;) {
			if (data[i] == 0) {
				i++;
			} else {
				if (i != j) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
				j++;
				i++;
			}
		}
	}
}
