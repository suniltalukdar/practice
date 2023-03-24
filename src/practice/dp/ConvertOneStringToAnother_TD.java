package practice.dp;

public class ConvertOneStringToAnother_TD {

    int getMinOps(String one, String two) {
	return getMinOpsHelper(new Integer[one.length()+1][two.length()+1], one, two, 0, 0);
    }

    private int getMinOpsHelper(Integer[][] dp, String one, String two, int i1, int i2) {
	if(dp[i1][i2]==null) {
	    if(one.length()==i1) {
		dp[i1][i2]= two.length()-i2;
	    }else if(two.length()==i2) {
		dp[i1][i2]= one.length()-i1;
	    }else if(one.charAt(i1)==two.charAt(i2)) {
		dp[i1][i2] = getMinOpsHelper(dp, one, two, i1+1, i2+1);
	    }else {

		int a = getMinOpsHelper(dp, one, two, i1+1, i2);
		int b = getMinOpsHelper(dp, one, two, i1, i2+1);
		int c = getMinOpsHelper(dp, one, two, i1+1, i2+1);
		dp[i1][i2] = Math.max(a, Math.max(c, b));
	    }
	}
	return dp[i1][i2];
    }

    public static void main(String[] args) {
	ConvertOneStringToAnother_TD obj = new ConvertOneStringToAnother_TD();
	System.out.println(obj.getMinOps("sunil", "xxxxxx"));
    }


}
