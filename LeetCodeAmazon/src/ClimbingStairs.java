
public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(stairCount(5));
	}

	private static int stairCount(int length) {
		int dp[] = new int[length+1];
		dp[0] = 1;
		dp[1] = 1;
		for(int i=2; i<= length; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[length];
	}

}
