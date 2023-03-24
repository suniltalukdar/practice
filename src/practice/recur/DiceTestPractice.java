package practice.recur;

import java.util.ArrayList;
import java.util.List;

public class DiceTestPractice {
	
	public static void printDiceCombo(int dice, List<Integer> list) {
		
		if(dice==0) {
			System.out.println(list);
			return;
		}else {
			for(int i=1;i<=6;i++) {
				list.add(i);
				printDiceCombo((dice-1), list);
				list.remove(list.size()-1);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDiceCombo(3, new ArrayList<Integer>());

	}

}
