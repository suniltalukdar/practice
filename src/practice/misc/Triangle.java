package practice.misc;

public class Triangle {

	public static void printTriangle(int val) {
		int start = val/2;
		int end = val/2;

		while(start !=0 && end !=val) {
			for(int i=0;i<start;i++) {
				System.out.print(" ");
			}
			for(int i=start; i<=end; i++) {
			System.out.print("*");
			}
			for(int i=end;i<val;i++) {
				System.out.print(" ");
			}
			System.out.println();
			start--;
			end++;
		}
	}

	public static void main(String[] args) {
		printTriangle(8);

	}

}
