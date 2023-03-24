package practice.binarytree;

public class Depth {
	
	int getDepth(Node node, int count) {
		if(node==null) {
			return count;
		}else {
			
				int left = getDepth(node.left, count+1);
				int right = getDepth(node.right, count+1);
			return Math.max(left, right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
