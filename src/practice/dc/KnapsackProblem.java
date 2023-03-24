package practice.dc;

public class KnapsackProblem {
    
    int countTotalProfit(int[] profit, int[] weight, int index, int maxAllowed) {
	
	if(maxAllowed<=0 || index>=profit.length) {
	    return 0;
	}else {
	    int include = 0;
	    if(weight[index]<=maxAllowed) {
	     include = profit[index] + countTotalProfit(profit, weight, index+1,
		     maxAllowed-weight[index]);
	    }
	    int exclude = countTotalProfit(profit, weight, index+1, maxAllowed);
	    return Math.max(include, exclude);
	}
    }

    public static void main(String[] args) {
	KnapsackProblem obj = new KnapsackProblem();
	int[] profit = { 31, 26, 72, 17 };
	int[] weight = { 3, 1, 5, 2 };
	int totalProfit = obj.countTotalProfit(profit, weight, 0, 7);
	System.out.println(totalProfit);
    }

}
