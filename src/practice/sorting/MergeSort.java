package practice.sorting;

public class MergeSort {

	
	/*
	 * void merge(int[] arr, int start, int mid, int end) {
	 * 
	 * int i=0,j=0, k=start;; // int[] m = new int[end];
	 * 
	 * int n1 = mid-start+1; int n2 = end-mid; int[] a = new int[n1]; int b[] = new
	 * int[n2]; for(int x=0;x<n1;x++) { a[x] = arr[start + x]; }
	 * 
	 * for(int x=0;x<n2;x++) { b[x] = arr[mid+1+x]; }
	 * 
	 * //traverse(b);
	 * 
	 * 
	 * for(int k=start;k<n1+n2;k++) { if(i<n1 && j<n2 && a[i]<b[j]) { arr[k]=a[i];
	 * i++; }else if(i<n1 && j==n2 ) { arr[k]=a[i]; i++; }else {
	 * 
	 * arr[k]=b[j]; j++; } }
	 * 
	 * 
	 * while(i<n1 && j<n2) { if(a[i]<=b[j]) { arr[k]=a[i]; i++; }else { arr[k] =
	 * b[j]; j++; } k++; }
	 * 
	 * while(i<n1) { arr[k]=a[i]; k++; i++; } while(j<n2) { arr[k]=a[j]; k++; j++; }
	 * }
	 * 
	 * 
	 * 
	 * void merge(int arr[], int l, int m, int r) { int n1 = m - l + 1; int n2 = r -
	 * m;
	 * 
	 * int L[] = new int [n1]; int R[] = new int [n2];
	 * 
	 * for (int i=0; i<n1; ++i) L[i] = arr[l + i]; for (int j=0; j<n2; ++j) R[j] =
	 * arr[m + 1+ j];
	 * 
	 * 
	 * Merge the temp arrays
	 * 
	 * // Initial indexes of first and second subarrays int i = 0, j = 0;
	 * 
	 * // Initial index of merged subarry array int k = l; while (i < n1 && j < n2)
	 * { if (L[i] <= R[j]) { arr[k] = L[i]; i++; } else { arr[k] = R[j]; j++; } k++;
	 * }
	 * 
	 * Copy remaining elements of L[] if any while (i < n1) { arr[k] = L[i]; i++;
	 * k++; }
	 * 
	 * Copy remaining elements of R[] if any while (j < n2) { arr[k] = R[j]; j++;
	 * k++; } }
	 * 
	 * static void traverse(int[] m) { for (int ele : m) { System.out.print(ele +
	 * " "); } }
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * MergeSort obj = new MergeSort(); int[] arr = // {12, 11, 13, 5, 6, 7} //
	 * {5,4,3,2,1}; { 4, 2, 7, 2, 7, 89, 9, 6 }; obj.sort(arr, 0, arr.length - 1);
	 * traverse(arr); }
	 */

}
