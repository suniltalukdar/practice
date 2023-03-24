package practice.recur;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static int index=0,sum=0;
    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
    	if(ar.length!=index) {
         sum += ar[index];
         index++; 
        simpleArraySum(ar);
    	}else {
    		return sum;
    	}
    	return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
		/*
		 * BufferedWriter bufferedWriter = new BufferedWriter(new
		 * FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * int arCount = Integer.parseInt(scanner.nextLine().trim());
		 * 
		 * int[] ar = new int[arCount];
		 * 
		 * String[] arItems = scanner.nextLine().split(" ");
		 * 
		 * for (int arItr = 0; arItr < arCount; arItr++) { int arItem =
		 * Integer.parseInt(arItems[arItr].trim()); ar[arItr] = arItem; }
		 */

        int result = simpleArraySum(new int[] {1,2,3,40,5});
        System.out.println(result);
		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */
    }
}
