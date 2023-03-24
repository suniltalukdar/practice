package practice.avl;

import practice.binarytree.Node;

public class Rotate {

	public Node rotateRight(Node node, Node root, Node prev) {
		Node temp = node.left.right;	
		if(node==root) {
			root = node.left;
		} 
		if(prev!=null) {
			prev.left = node.left;
		}	
		node.left.right = node;
		node.left = temp;;
			
		return root;
	}

	public Node rotateLeft(Node node, Node root) {
		try {
			Node x = node.right;
			Node y=null;
			if(x!=null) {
				y = x.left;
			}
			if(node==root) {
				x=root;
			}

			x.left=node;
			node.right=y;
			return root;
		}catch(NullPointerException ex) { 
			System.out.println(node.data);
			return root;
		}
	}
}
