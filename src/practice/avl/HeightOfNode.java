package practice.avl;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import practice.binarytree.Node;

public class HeightOfNode {
	
	Node root;

	void insert(int data) {
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
			int lh = getHeight(temp.left, -1);
			int rh = getHeight(temp.right, -1);
			int balanceFactor = lh-rh;
			//System.out.println("difference " + temp.data + " " + balanceFactor);
			if(balanceFactor>2) {
				rotateLL(temp);
			}
		}

	}
	/**
	 * for now only work for root element
	 * @param node
	 */
	private void rotateLL(Node node) {
		assert(node!=null);
		if(node==root) {
			root = node.left;
		}
		Node temp = node.left.right;
		node.left.right= node;
		node.left=temp;
	}
	
	Node getNode(int data) {
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
			int lh = getHeight(node.left, count+1);
			int rh = getHeight(node.right, count+1);
			
			return Math.max(lh, rh);
		}
	}
	
	void levelOrder(Node node) {
		Queue<Node> queue = new ArrayDeque<Node>();

		queue.add(node);

		while(!queue.isEmpty()) {
			Node current = queue.remove();
			System.out.println(current.data);
			if(current.left!=null) {
				queue.add(current.left);
			}
			if(current.right!=null){
				queue.add(current.right);
			}
		}
	}


	public static void main(String[] args) {		
		HeightOfNode obj = new HeightOfNode();
//		obj.insert(4);
//		obj.insert(6);
//		obj.insert(1);
//
//		obj.insert(3);
//		obj.insert(9);
//		obj.insert(5);
//		obj.insert(2);
		obj.insert(40);
		obj.insert(20);
		obj.insert(10);
		obj.insert(5);
		obj.insert(50);
		obj.insert(30);
		obj.insert(2);
		obj.insert(1);

		int result1 = obj.getHeight(obj.root.left, -1);
		int result2 = obj.getHeight(obj.root.right, -1);
		//System.out.println(result1-result2);
		System.out.println("level order ");
		obj.levelOrder(obj.root);
		System.out.println(obj.root.right.data + " " + obj.root.right.left.data + "=30");
		

	}

}
