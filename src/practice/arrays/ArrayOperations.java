package practice.arrays;

import java.util.Scanner;

public class ArrayOperations {
	
	static Scanner sc = new Scanner(System.in);
	
	Integer[] insert(Integer[] arr) {
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	Integer randomAccess(Integer[] arr, int index) {
		if(arr.length<=index) {
			return -1;
		}else {
			return arr[index];
		}
	}
	
	Integer searchElement(Integer[] arr, int ele) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				return arr[i];
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations obj = new ArrayOperations();
		Integer[] arr = obj.insert(new Integer[5]);
		
		for(Integer a:arr) {
			System.out.println(a);
		}
		
		System.out.println("get value for (index start from 0)");
		int index = sc.nextInt();
		int result = obj.randomAccess(arr, index);
		System.out.println("value at index= " + result);
		System.out.println("Insert element to search");
		int ele = sc.nextInt();
		System.out.println(obj.searchElement(arr, ele));
	}

}
