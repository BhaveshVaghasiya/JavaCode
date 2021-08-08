
public class MaxLoot {
	static int maxLoot(int hval[], int n)
    {
        if (n == 0)
        return 0;
  
        int value1 = hval[0];
        if (n == 1)
            return value1;
  
        int value2 = Math.max(hval[0], hval[1]);
        if (n == 2)
            return value2;
   
        // contains maximum stolen value at the end
        int max_val = 0;
  
        // Fill remaining positions
        for (int i=2; i<n; i++)
        {
            max_val = Math.max(hval[i]+value1, value2);
            value1 = value2;
            value2 = max_val;
        }
  
        return max_val;
    }
     
    // driver program
    public static void main (String[] args)
    {
        int hval[] = {5, 3, 4, 11, 2};
        int n = hval.length;
        System.out.println("Maximum loot value : " + maxLoot(hval, n));
    }
}
