package practice.recur;

import java.util.ArrayList;
import java.util.List;

public class CoinChange {

    static Long getCount(int n,int i, List<Long> c,Long[][] dp) {
	if(n==0) {
	    return (long) 1;
	}	
	if(i>=c.size() || n<0) {
	    return (long) 0;
	}
	
	if(dp[i][n] == null) {
	    dp[i][n] = getCount(n, i+1, c, dp) + getCount(n-c.get(i).intValue(), i, c, dp);
	}
	return dp[i][n];
	
    }
    public static void main(String[] args) {
	List<Long> c = new ArrayList<Long>();
	c.add((long) 1);
	c.add((long) 2);
	c.add((long) 3);
	
	Long[][] dp = new Long[c.size()][5];
	System.out.println("Test " + dp[0][1]);
	System.out.println(getCount(4, 0, c, dp));

    }

}
