package practice.sorting;

public class InsertionSort {

	int[] sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i;
			int currentEle = arr[i];
		while(j>0 && arr[j-1]>currentEle) {
			arr[j] = arr[j-1];
			j--;
		}
		 arr[j] = currentEle;
		}
		return arr;
	}
	
	void traverse(int[] a) {
		for(int val:a) {
			System.out.println(val);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort obj = new InsertionSort();
		int[] a = new int[] {5,2,7,1,9,0,3};
		obj.sort(a);
		obj.traverse(a);


	}

}
