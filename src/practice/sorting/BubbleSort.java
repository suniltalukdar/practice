package practice.sorting;

public class BubbleSort {
	
	int[] sort(int[] a) {
		for(int i=0;i<a.length; i++) {
			for(int j=0;j<a.length-i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	
	void traverse(int[] a) {
		for(int val:a) {
			System.out.println(val);
		}
	}

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int[] a = new int[] {5,2,7,1,9,0,3};
		obj.sort(a);
		obj.traverse(a);

	}

}
