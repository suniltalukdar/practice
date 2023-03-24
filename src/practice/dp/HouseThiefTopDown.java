package practice.dp;

public class HouseThiefTopDown {

	int getMaxProfit(int[] values, int index, int[] dp) {
		if(index>=values.length) {
			return 0;
		}
		
		if(dp[index]==0) {
			int takeVal = values[index]+getMaxProfit(values, index+2, dp);
			int skipVal = getMaxProfit(values, index+1, dp);
			dp[index]=Math.max(takeVal, skipVal);
		}
		
		return dp[index];
	}
	
	public static void main(String[] args) {
		HouseThiefTopDown obj = new HouseThiefTopDown();
		int result = obj.getMaxProfit(new int[] {7,1, 9,30,1},0,new int[5]);
		System.out.println(result);

	}

}
