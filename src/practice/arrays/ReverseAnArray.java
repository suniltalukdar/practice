
package practice.arrays;

public class ReverseAnArray {
	
	Integer[] reverseArray(Integer[] arr) {
		int temp;
		for(int i=0,j=arr.length-1; i<arr.length/2; i++,j--) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		return arr;
	}
	
	void arrTraverse(Integer[] arr) {
		for(int a:arr) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		Integer[] arrOdd = {1,2,3,4,5};
		Integer[] arrEven = {4, 5, 1, 2};
		//Integer[] arrSingle = new Integer[1];
		Integer[] arr;
		ReverseAnArray obj = new ReverseAnArray();
		arr = obj.reverseArray(arrOdd);
		obj.arrTraverse(arr);
		
		arr = obj.reverseArray(arrEven);
		obj.arrTraverse(arr);
		
		
		
		

	}

}
