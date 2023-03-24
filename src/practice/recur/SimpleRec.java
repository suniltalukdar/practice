package practice.recur;

import java.util.ArrayList;
import java.util.List;

public class SimpleRec {

	static List<Integer> simpleInsert(Integer[] arr, int n, List<Integer> list){
		if(arr.length-1==n) {
			return list;
		}else {
			
			
			if(arr[n]%2==0) {
				n++;
				simpleInsert(arr, n, list);
				System.out.println(n);
				list.add(arr[n]);
				
			}else {
				//System.out.println(n);
				n++;
				simpleInsert(arr, n, list);
			}
			
			return list;
		}
		
	}
	
	public static void main(String[] args) {
		List<Integer> list = simpleInsert(new Integer[] {1,2,4,5,3,6,9,8}, 0, new ArrayList<Integer>());
		System.out.println(list);
	}

}
