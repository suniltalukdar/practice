package practice.recur;

public class LoopRecursion {
	
	public static void testRecursion(int val, int x) {
		if(val==2) {
			System.out.println("return");
			return;
		}else {
			for(int i=x;i<3;i++) {
				//System.out.println(val + " index " + x + " counter");
				System.out.println("before i " + i+ " val " + val +" x " +x);
				val++;
				x++;
				testRecursion(val,x);
				//System.out.println("after i " + i+ " val " + val +" x " +x);
				//return;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testRecursion(-1,0);
	}

}
