package practice.arrays;

import java.util.Scanner;

public class TwoDSimpleArray {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] arr = new Integer[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
