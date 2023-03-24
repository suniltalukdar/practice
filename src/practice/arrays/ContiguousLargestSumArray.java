package practice.arrays;

public class ContiguousLargestSumArray {
    
    static int sum(int[] arr) {
	int maxSum=Integer.MIN_VALUE, currentSum=0;
	
	for(int i=0;i<arr.length;i++) {
	    currentSum += arr[i];
	    System.out.println(arr[i] + " -- "+ currentSum);
	    if(maxSum<currentSum) {
		maxSum=currentSum;
	    } 
	    System.out.println(maxSum);
	    if(currentSum<0) {
		currentSum=0;
	    }
	}
	return maxSum;
    }

    public static void main(String[] args) {
	System.out.println(sum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
    }
}
