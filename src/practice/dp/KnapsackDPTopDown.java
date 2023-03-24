package practice.dp;


public class KnapsackDPTopDown {

    int getMaxProfit(int[] profit, int[] weight,int capacity) {
	Integer[][] dp = new Integer[weight.length][capacity+1];
	return getMaxProfitHelper(profit, weight, capacity, 0, dp);
    }
    private int getMaxProfitHelper(int[] profit, int[] weight, int capacity, 
	    int index, Integer[][] dp) {

	if(capacity<=0 || index<0 || index>=profit.length) {
	    return 0;
	}

	if(dp[index][capacity]!=null) {
	    return dp[index][capacity];
	}
	
	int profit1=0;
	if(capacity>=weight[index]) {
	    profit1=profit[index] + getMaxProfitHelper(profit, weight,
		    capacity-weight[index], index+1, dp);
	}
	int profit2 = getMaxProfitHelper(profit, weight, capacity, index+1, dp);
	dp[index][capacity]=Math.max(profit1, profit2);
	return dp[index][capacity];
    }
    public static void main(String[] args) {
	KnapsackDPTopDown obj = new KnapsackDPTopDown();
	int[] profit = { 31, 26, 72, 17 };
	int[] weight = { 3, 1, 5, 2 };
	int totalProfit = obj.getMaxProfit(profit, weight, 7);
	System.out.println(totalProfit);
    }

}
