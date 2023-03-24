package practice.sorting;

public class QuickSort {
	
	public void sort(int[] arr, int start, int end) {
		if(start <end) {
			int pivot=arr[end];
			int counter =  sorthelper(arr, pivot, start, end);
			sort(arr,start,counter-1);
			sort(arr,counter+1, end);
		}
		
	}

	private int  sorthelper(int[] arr, int pivot, int start, int end) {
		int counter=start-1;
		for(int i=start; i<=end; i++) {
			if(arr[i]<=pivot) {
				counter++;
				int temp = arr[i];
				arr[i] = arr[counter];
				arr[counter] = temp;
			}
		}
		return counter;
	}
	
	public void traverse(int[] a) {
		for(int val:a) {
			System.out.println(val);
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		QuickSort obj = new QuickSort();
//		int[] a = //new int[] {1,7,2,4};
//			//{9,8,7,6,5,4,3,2,1};
//			//{5,1,87,2,4,7,4,0}
//				//{5,4,3,2,1}
//				{1,2,3,4,5};
//		//obj.sorthelper(a, 4, 0, a.length-1);
//		obj.sort(a, 0, a.length-1);
//		obj.traverse(a);
//	}

}
