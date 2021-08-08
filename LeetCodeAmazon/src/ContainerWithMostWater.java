
public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] data= {1,8,6,2,5,4,8,3,7};
		ContainerWithMostWater containerWithMostWater  =new ContainerWithMostWater();
		System.out.println("Max water in container: " + containerWithMostWater.maxWater(data));
	}

	private int maxWater(int[] data) {
		int result = Integer.MIN_VALUE;
		for(int i=0, j = data.length - 1; i<j;) {
			result = Math.max(result, Math.min(data[i], data[j]) * (j-i));
			if(data[i] < data[j]) {
				i++;
			} else {
				j--;
			}
		}
		return result;
	}

}
