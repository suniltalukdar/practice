package practice.recur;

import java.util.ArrayList;
import java.util.List;

public class SumOfSet {

	public static void setSum(int[] arr, int index, int sum, List<Integer> set) {
		if(arr.length == index) {
			return;
		}else {

			
			for(int i=index+1;i<arr.length;i++) {
				index++;
				set.add(arr[i]);
				sum += arr[i];
				if(sum==5) {
					System.out.println(set + " sum is "+ sum);
					//return;
				}
				setSum(arr, index, sum, set);
				sum -= set.get(set.size()-1);
				set.remove(set.size()-1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,1,1};
		setSum(arr, -1, 0, new ArrayList<Integer>());

	}

}
