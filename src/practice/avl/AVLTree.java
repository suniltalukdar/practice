package practice.avl;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import practice.avl.Rotate;
import practice.binarytree.Node;

public class AVLTree {
	Node root;
	Rotate rotate = new Rotate();
	void insert(int data) {
	//	System.out.println(data);
		Node node = getNode(data);
		Stack<Node> st = new Stack<Node>();
		st.push(node);
		if(root==null) {
			root = node;
		}else {
			Node current = root;
			Node prev = current;

			while(current != null) {
				st.push(current);
				if(current.data>node.data) {
					prev = current;
					current = current.left;
				}else {
					prev = current;
					current = current.right;
				}
			}

			if(prev.data>node.data) {
				prev.left = node;
			}else {
				prev.right = node;
			}

		}

		while(!st.isEmpty()) {
			Node temp = st.pop();

			Node prev = null;

			int lh = getHeight(temp.left, -1);
			int rh = getHeight(temp.right, -1);
			int balanceFactor = lh-rh;
			if(balanceFactor>=2) {
				if(!st.isEmpty()) {
					 prev = st.peek();
					}
				if(data<temp.left.data) {
					root = rotate.rotateRight(temp,root,prev);
				}else {
					root = rotate.rotateLeft(temp.left,root);
					root = rotate.rotateRight(temp, root,prev);
				}
			}else if(balanceFactor<=-2) {
				prev = st.peek();
				if(data>temp.right.data) {
					root = rotate.rotateLeft(temp,root);
				}else {
					root = rotate.rotateRight(temp.right,root, prev);
					root = rotate.rotateLeft(temp, root);
				}
			}
		}

	}
	
	private Node getNode(int data) {
		Node node = new Node();
		node.data=data;
		node.left=null;
		node.right=null;

		return node;
	}
	
	public int getHeight(Node node, int count) {
		if(node==null) {
			return count;
		}else {
			try {
			int lh = getHeight(node.left, count+1);
			int rh = getHeight(node.right, count+1);
			return Math.max(lh, rh);
			}catch(Error e) {
				//System.out.println("Node val " + node.data + " "+ e.getMessage() );
			return 0;
			}
			
		}
	}
	void levelOrder(Node node) {
		Queue<Node> queue = new ArrayDeque<Node>();

		queue.add(node);

		while(!queue.isEmpty()) {
			Node current = queue.remove();
			System.out.print(current.data + " ");
			if(current.left!=null) {
				queue.add(current.left);
			}
			if(current.right!=null){
				queue.add(current.right);
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		AVLTree obj = new AVLTree();
		obj.insert(30);
		obj.insert(20);
		obj.insert(40);
		obj.levelOrder(obj.root);
		obj.insert(10);
		obj.levelOrder(obj.root);
		obj.insert(5);
		obj.levelOrder(obj.root);
		obj.insert(3);
		obj.levelOrder(obj.root);
		obj.insert(4);
		obj.levelOrder(obj.root);
		obj.insert(50);
		obj.levelOrder(obj.root);
		obj.insert(60);
		obj.levelOrder(obj.root);
//		obj.insert(70);
//		obj.levelOrder(obj.root);
//		obj.insert(65);
//		obj.levelOrder(obj.root);
	}

}
