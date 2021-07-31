
public class Result {

	public static void main(String[] args) {
		String s= "abladc";
		int[][] dp = new int[s.length()][s.length()];
		int iIndex = 0;
		int max = 1;
		for(int g= 0; g< s.length(); g++) {
			for(int i=0, j =g; j< s.length(); i++,j++){
				if(g == 0) {
					dp[i][j] = 1;
				} else if(g==1) {
					if(s.charAt(i) == s.charAt(j)) {
						dp[i][j] = 1;
						max = 2;
						iIndex =i;
					}else {
						dp[i][j] = 0;
					}
				} else {
					if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == 1) {
						dp[i][j] = 1;
						if(max < g+1) {
							max= g+1;
							iIndex =i;
						} 
					}else {
						dp[i][j] = 0;
					}
				}
			}
		}
		System.out.println(s.substring(iIndex,iIndex+ max));
	}

}
