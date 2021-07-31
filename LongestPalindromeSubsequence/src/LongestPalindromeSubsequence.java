
public class LongestPalindromeSubsequence {
	public static void main(String args[]) {
		System.out.println(lca("abdbacc"));
	}

	private static int lca(String s) {
		int[][] dp= new int[s.length()][s.length()];
		for(int i=0; i<dp.length; i++) {
			for(int j =0, k=i;k<dp.length; j++,k++) {
				if(i==0) {
					dp[j][k] = 1;
				}
				else if(i == 1){
					dp[j][k] = s.charAt(j) == s.charAt(k)? 2:1; 
				}
				else {
					if(s.charAt(j) == s.charAt(k)) {
						dp[j][k] = 2 + dp[j+1][k-1];
					} else {
						dp[j][k] = Math.max(dp[j][k-1] ,dp[j+1][k]);
					}
				}
			}
		}
		return dp[0][s.length()-1];
	}
}
