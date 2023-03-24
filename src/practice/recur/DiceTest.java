package practice.recur;

import java.util.ArrayList;
import java.util.List;

public class DiceTest {

	/*
	 * public void sets(int dice, List<Integer> list) { System.out.println("dice "
	 * +dice + " list " +list); if(dice==0) { System.out.println(list); return;
	 * }else { for(int i=1;i<=6;i++) { list.add(i); //System.out.println("dice -" +
	 * dice); sets((dice-1), list); //System.out.println(i);
	 * list.remove(list.size()-1); } } }
	 */

	public void sets(int dice, List<Integer> list, int sum, int sumSoFar) {
		System.out.println("dice " +dice + " list " +list);
		if(dice==0) {
			System.out.println(list);
			return;
		}else{

			for(int i=1;i<=6;i++) {
				System.out.println("sumSoFar " + sumSoFar);
				list.add(i);
				//System.out.println("dice -" + dice);
				sets((dice-1), list, sum, sumSoFar+i);
				//System.out.println(i);
				list.remove(list.size()-1);
			}

		}
	}

	public void diceSum(int dice, int sum) {
		List<Integer> list = new ArrayList<Integer>();
		sets(2, list, sum, 0);
	}

	public static void main(String[] args) {
		DiceTest obj = new DiceTest();

		obj.diceSum(2, 7);
	}

}
