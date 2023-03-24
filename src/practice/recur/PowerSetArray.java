package practice.recur;

import java.util.ArrayList;
import java.util.List;

public class PowerSetArray {
	
	void generateSet(String[] arr, int index, String set, List<String> list) {
		int n = arr.length;
		System.out.println(list);
		if(index==n) {
			return;
		}else {

			for(int i=index+1;i<n;i++) {
				set += arr[i];
				list.add(set);
				generateSet(arr, i, set, list);
				list.remove(set.substring(0, set.length()-1));
				set = set.substring(0, set.length()-1);
			}
		}
	}

	public static void main(String[] args) {
		PowerSetArray obj = new PowerSetArray();
		List<String> sub =  new ArrayList<String>();
		obj.generateSet(new String[] {"a", "b",  "c"}, -1, "", sub); 
		System.out.println(sub);

	}

}
