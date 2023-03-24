package practice.dp;

public class LongestCommonSubSequenceTopDown {

    int getLCS(String s1, String s2) {
	Integer[][] dp = new Integer[s1.length()+1][s2.length()+1];
	return getLCSHelper(s1,s2,0,0, dp);
    }
    private int getLCSHelper(String s1, String s2, int i1, int i2, Integer[][] dp) {
	if(s1.length()==i1 || s2.length()==i2) {
	    return 0;
	}
	if(dp[i1][i2]==null) {
	
	if(s1.charAt(i1)==s2.charAt(i2)) {
	    dp[i1][i2] = 1+getLCSHelper(s1, s2, i1+1, i2+1, dp);
	    return dp[i1][i2];
	}else {
	    int b = getLCSHelper(s1, s2, i1+1, i2, dp);
	    int c = getLCSHelper(s1, s2, i1, i2+1, dp);
	    dp[i1][i2] = Math.max(c, b);
	}
	}
	return dp[i1][i2];
    }
    public static void main(String[] args) {
	LongestCommonSubSequenceTopDown obj = new LongestCommonSubSequenceTopDown();
	System.out.println(obj.getLCS("sunil", "linus"));

    }

}
