package practice.recur;

public class FactorialBU {
    
    static int getFactorial(int[] fact, int t1, int t2, int n) {
	
	fact[0]= t1;
	fact[1]= t2;
	
	for(int i=2;i<n; i++) {
	    fact[i]=(fact[i-1]*fact[i-1])+fact[i-2];
	}
	return fact[n-1];
    }

    public static void main(String[] args) {
	System.out.println(getFactorial(new int[10], 0, 1, 10));

    }

}
