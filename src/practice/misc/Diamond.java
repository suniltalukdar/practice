package practice.misc;

public class Diamond {

   static void printDiamond(int size) {
	int noSpace=size/2;
	int noStar =1;
	int mid = size/2;
	for(int i=0;i<=size;i++) {
	    for(int j=0;j<noSpace;j++) {
		System.out.print(" ");
	    }
	    for(int k=0;k<noStar;k++) {
		System.out.print("*");
		
	    }
	    System.out.println();
	    if(i<mid) {
		noStar += 2;
		noSpace -= 1;
	    }else {
		noStar -= 2;
		noSpace +=1;
	    }
	}
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	printDiamond(50);

    }

}
