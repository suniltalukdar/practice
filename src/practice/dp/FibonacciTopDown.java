package practice.dp;

public class FibonacciTopDown {

	int generateFibo(int n, int[] dp) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}

		if(dp[n]==0) {
			dp[n]=generateFibo(n-1, dp)+generateFibo(n-2, dp);
		}
		return dp[n];
	}
	public static void main(String[] args) {
		FibonacciTopDown obj = new FibonacciTopDown();
		int a = obj.generateFibo(10, new int[11]);
		System.out.println(a);

	}

}
