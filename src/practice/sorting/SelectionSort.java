package practice.sorting;

public class SelectionSort {
	
	int[] sort(int[] a) {
		for(int i=0;i<a.length-1; i++) {
			int min = i;
			for(int j=i+1; j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;

				}
			}
			if(min !=i) {
			swap(a, i, min);
			}
		}
		return a;
	}

	private void swap(int[] a, int i, int min) {
		int temp = a[i];
		a[i]=a[min];
		a[min]=temp;
		
	}
	
	void traverse(int[] a) {
		for(int val:a) {
			System.out.println(val);
		}
	}


	public static void main(String[] args) {
		SelectionSort obj = new SelectionSort();
		int[] a = new int[] {5,2,7,1,9,0,3};
		obj.sort(a);
		obj.traverse(a);

	}

}
