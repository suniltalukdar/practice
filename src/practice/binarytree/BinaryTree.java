package practice.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;



public class BinaryTree {

	static Node root=null;

	void insert(int data) {
		Node temp = new Node();
		temp.data = data;

		if(root==null) {
			root = temp;
		}else {
			Deque<Node> queue = new ArrayDeque<Node>();
			Node runner;
			queue.add(root);

			while(!queue.isEmpty()) {
				runner = queue.remove();
				if(runner.left == null) {
					temp.data = data;
					temp.left=null;
					temp.right=null;					
					runner.left = temp;					
					return;
				}else if(runner.right==null){
					temp.data = data;
					temp.left=null;
					temp.right=null;					
					runner.right = temp;					
					return;
				}else {
					queue.add(runner.left);
					queue.add(runner.right);
				}
			}
		}
	}

	void inorder(Node node) {
		if(node==null) {
			return;
		}else {
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
		}
	}

	void levelOrder(Node node) {
		System.out.println( "\n"+ "Level Order");
		if(node==null) {
			System.out.println("Empty ");
		}else {
			Deque<Node> queue = new ArrayDeque<Node>();
			queue.add(node);
			while(!queue.isEmpty()) {
				node = queue.remove();
				System.out.print( node.data + " ");
				if(node.left != null) {
					queue.add(node.left);
				}
				if(node.right != null) {
					queue.add(node.right);
				}
			}
		}
	}

	void deleteNode(int val) {
		if(root==null) {
			System.out.println("Empty List");
		}else {
			Node node=root;
			Node temp = getNode(node, val);
			Node var = getLastNodeValue(node);
			temp.data=var.data;
			deleteLastNode(node);
		}		
		levelOrder(root);
	}

	Node getNode(Node node, int val) {

		Deque<Node> queue = new ArrayDeque<Node>();
		queue.add(node);
		while(!queue.isEmpty()) {
			node = queue.remove();
			if(node.data==val) {
				return node;
			}else {
				if(node.left != null) {
					queue.add(node.left);
				}
				if(node.right != null) {
					queue.add(node.right);
				}
			}
		}
		return null;
	}

	void deleteLastNode(Node node) {
		Deque<Node> queue = new ArrayDeque<Node>();
		queue.add(node);
		Node prev, current=null;

		while(!queue.isEmpty()) {
			prev=current;
			current = queue.remove();

			if(current.left==null) {
				prev.right=null;
				return;
			}

			if(current.right==null) {
				current.left=null;
				return;
			}


			queue.add(current.left);
			queue.add(current.right);
		}
	}

	Node getLastNodeValue(Node node) {

		Deque<Node> queue = new ArrayDeque<Node>();
		queue.add(node);
		while(!queue.isEmpty()) {
			node = queue.remove();

			if(node.left != null) {
				queue.add(node.left);
			}
			if(node.right != null) {
				queue.add(node.right);
			}
		}

		return node;
	}

	int depth(Node node, int count) {
		if(node==null) {
			return count;
		}else {
			int a = depth(node.left, count+1);
			int b = depth(node.right, count+1);
			return Math.max(a, b);
		}

	}
	
	List<Integer> getListOfInorder(Node node, List<Integer> list){
		if(node==null) {
			return null;
		}else {
			getListOfInorder(node.left, list);
			list.add(node.data);
			getListOfInorder(node.right, list);
			
		}
		return list;
	}

	boolean checkSortedArray(List<Integer> list) {
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i)>list.get(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * NOT IN WORKING CONDITION
	 * @param node
	 */
	void topView(Node node) {
		if(node==null) {
			return;
		}else {
			System.out.println(node.data);
			if(node.right==null) {
				topView(node.left);
			}else {
				topView(node.right);
			}
		}
	}

	public static void main(String[] args) {
		BinaryTree obj = new BinaryTree();

		obj.insert(3);
		obj.insert(1);
		obj.insert(4);
		obj.insert(2);
		obj.insert(9);
		obj.insert(6);
		obj.insert(7);
		obj.insert(8);
		obj.inorder(root);
		obj.levelOrder(root);

		//obj.deleteNode(2);

		/*
		 * int a = obj.depth(root, 0); System.out.println("depth" + a);
		 * 
		 * 
		 */

		
		List<Integer> list = obj.getListOfInorder(obj.root, new ArrayList<Integer>());
		System.out.println(list);
		
		boolean flag = obj.checkSortedArray(list);
		System.out.println(flag);
	}

}
