package practice.misc;

public class RecursionRetVal {
	
	static int test(int a,int i) {
		if(a==3) {
			return i;
		}else {
			test(a+1, i+1);
		}
		return i;
	}
	
	static int b(int a,int i) {
		if(a==3) {
			return i;
		}else {
			return b(a+1, i+1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = test(0,0);
		int y = b(0,0);
		
		System.out.println(x +" "+y);
	}

}
