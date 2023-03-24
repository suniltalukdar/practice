package practice.arrays;

import java.util.HashSet;
import java.util.Set;

public class RearrangeBasedOnIndex {
	
	void rearrange(Integer[] arr) {
		int temp;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]!=i) {
				for(int j=0;j<arr.length;j++) {
					if(arr[j]==i) {
						temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
				}
			}
		}
		traverse(arr);
	}
	
	void traverse(Integer[] arr) {
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

	public static void main(String[] args) {
		RearrangeBasedOnIndex obj = new RearrangeBasedOnIndex();
		
		obj.rearrange(new Integer[] {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1});
		System.out.println("second");
		obj.rearrange(new Integer[]{19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
              11, 10, 9, 5, 13, 16, 2, 14, 17, 4});

		/*
		 * testing
		 */
		
		Set<Integer> set = new HashSet<Integer>();

	}
}
