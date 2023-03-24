package practice.recur;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllSubset {
	
	static void calculateSumofSubsetHelper(List<Integer> list, int sum, List<Integer> subSet) {
		if(list.isEmpty()) {
			System.out.println(sum + " " + subSet);
			
		}else {
			Integer val = list.get(0);
			list.remove(0);
			
			calculateSumofSubsetHelper(list, sum, subSet);
			
			subSet.add(val);
			sum += val;
			calculateSumofSubsetHelper(list, sum, subSet);
			subSet.remove(val);
			list.add(0, val);		
			
		}
	}

	static void calculateSumofSublists(List<Integer> list) {
		calculateSumofSubsetHelper(list, 0, new ArrayList<Integer>());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		calculateSumofSublists(list);
	}

}
