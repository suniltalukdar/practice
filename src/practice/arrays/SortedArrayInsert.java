package practice.arrays;

public class SortedArrayInsert {
	
	public void insert(int[] arr, int val) {
		if(val>arr[arr.length-2]) {
			arr[arr.length-1]=val;
		}else {
			int i=arr.length-2;
			int j = arr.length-1;
			while(i>-1 && arr[i]>val) {
				arr[j]=arr[i];
				j--;
				i--;
			}
			arr[j]=val;
			
		}
	}

	public static void main(String[] args) {
		SortedArrayInsert obj = new SortedArrayInsert();
		int[] arr = new int[5];
		arr[0]=4;
		arr[1]=6;
		arr[2]=7;
		arr[3]=9;
		for(int a:arr) {
			System.out.println(a);
		}
		obj.insert(arr, 3);
		System.out.println("After");
		for(int a:arr) {
			System.out.println(a);
		}

	}

}
