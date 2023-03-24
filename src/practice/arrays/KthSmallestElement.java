package practice.arrays;

import practice.sorting.QuickSort;

public class KthSmallestElement {

	void smallestEle(int[] arr, int k) {
		if(k>arr.length-1) {
			System.out.println("waah");
			return;
		}
		QuickSort obj = new QuickSort();
		int count=0;
		obj.sort(arr, 0, arr.length-1);
		int ele = arr[0];
		obj.traverse(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>ele) {
				count++;
				ele = arr[i];
			}
			
			if(count+1==k) {
				break;
			}
		}
		System.out.println(ele);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthSmallestElement obj = new KthSmallestElement();
		obj.smallestEle(new int[]{1, 6,3,4,5,9,2}, 4);

	}

}
