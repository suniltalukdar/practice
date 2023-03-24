package practice.binarytree;

import java.util.logging.Level;

public class BinaryTreeArray {

	Integer[] tree = new Integer[15];
	int lastIndex=0, root=0;
	
	void insert(int value ) {
		if(lastIndex==0) {
			tree[lastIndex+1]=value;			
			root=lastIndex+1;
			lastIndex = lastIndex+1;
		}else {
			if(lastIndex==tree.length-1) {
				System.out.println("Tree is full");
			}else {
				lastIndex ++;
				tree[lastIndex] = value;
				
			}
		}
	}
	
	void inorder(int rootIndex) {
		if(rootIndex>lastIndex) {
			return;
		}else {
			inorder(rootIndex*2);
			System.out.println(tree[rootIndex]);
			inorder((rootIndex*2)+1);
		}
	}
	
	void levelorder() {
		for(int i=1;i<lastIndex+1;i++) {
			System.out.println(tree[i]);
		}
	}
	
	void delete(int value) {
		int temp = tree[lastIndex];
		
		for(int i=root;i<=lastIndex;i++) {
			if(tree[i]==value) {
				tree[i]=temp;
				lastIndex -=1;
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeArray obj = new BinaryTreeArray();
		obj.insert(3);
		obj.insert(4);
		obj.insert(2);
		obj.insert(1);
		obj.insert(9);

		obj.inorder(obj.root);
		System.out.println("Level Order");
		obj.levelorder();
		System.out.println("After Delete");
		obj.delete(1);
		obj.levelorder();
	}

}
