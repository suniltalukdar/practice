package practice.misc;

public class RecursionTest {
	
	static int some(int n, int count) {
		if(n==9) {
			return count;
		}else {
			
			int x = some(n+1, count+1);
			//System.out.println(x + "x" + "\n y");
			int y = some(n+1, count+2);
			//System.out.println(y);
			//return Math.max(x, y);
			return y;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = some(3, 0);
		System.out.println("final " + x);
	}

}
