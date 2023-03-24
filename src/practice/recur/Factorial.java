package practice.recur;

public class Factorial {

	int getFactorial(int n) {
		int fact=0;
		if(n==1) {
			return 1;
		}else {
			fact += n*getFactorial(n-1);
			return fact;
		}
		
	}
	public static void main(String[] args) {
		Factorial obj = new Factorial();
		int a = obj.getFactorial(5);
		System.out.println(a);

	}

}
