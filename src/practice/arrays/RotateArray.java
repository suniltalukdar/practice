package practice.arrays;

public class RotateArray {
	
	static void rotate(int[] arr, int d, int n) {
		if(d>=n) {
			return;
		}else {
			for(int i=0;i<d;i++) {
				int temp=arr[0];
				for(int j=0;j<n-1;j++) {					
					arr[j]=arr[j+1];					
				}
				arr[n-1]=temp;
			}
			
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		rotate(new int[] {1,2,3,4,5}, 1,5);

	}

}
