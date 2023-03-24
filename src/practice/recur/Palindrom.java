package practice.recur;

public class Palindrom {
	
	static int  check(int n,int rev) {
		if(n==0) {
			//System.out.println(rev);
			return rev;
		}else {
			rev=(rev*10)+ n%10;
			n = n/10;
			return check(n,rev);
			/*
			 * if(n==rev) { System.out.println("true"); }else { System.out.println("false");
			 * }
			 */
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = check(13331,0);
		System.out.println(r);
	}

}
