package practice.dc;

public class NumberOfWays {
	
	static int getNoOfWays(int n) {
		if(n==0) {
			return 1;
		}else if(n<0) {
			return 0;
		}else {
		
		int p1= getNoOfWays(n-1);
		int p2 = getNoOfWays(n-2);
		int p3 = getNoOfWays(n-3);
		return p1+p2+p3;
		}
	}

	public static void main(String[] args) {
		System.out.println(getNoOfWays(3));
	}

}
