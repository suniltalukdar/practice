package practice.misc;

/*
 * problem with the last ele 
 */
public class MergeArray {

	void merge(int[] a, int[] b) {
		int i=0,j=0,k=0;
		int[] m = new int[a.length+b.length];
		
		for(k=0;k<m.length;k++) {
			if(i<a.length && j<b.length && a[i]<b[j]) {
				m[k]=a[i];
				i++;
			}else if(i<a.length && j==b.length ) {
				m[k]=a[i];
				i++;
			}else {
				m[k]=b[j];
				j++;
			}
		}
		traverse(m);
	}

	void traverse(int[] m) {
		for(int ele:m) {
			System.out.println(ele);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeArray obj = new MergeArray();
		
		obj.merge(new int[] {7}, new int[] {0});
	}

}
