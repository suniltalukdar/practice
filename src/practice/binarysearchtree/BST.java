package practice.binarysearchtree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import practice.linkedlist.SingleNode;


class Node{
	int data;
	Node left;
	Node right;
}

public class BST {
	Node root;

	void insert(int data) {
		Node node = getNode(data);
		if(root==null) {
			root = node;
		}else {
			Node current = root;
			Node prev = current;

			while(current != null) {
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
				prev.right  =node;
			}

		}

	}

	void inorder(Node node) {		
		if(node==null) {
			return;
		}else {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}

	void preOrder(Node node) {		
		if(node==null) {
			return;
		}else {
			System.out.println(node.data);
			preOrder(node.left);			
			preOrder(node.right);
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

	Node lca(Node node, int valueOne, int valueTwo) {

		while(node!=null) {
			if(node.data>valueOne && node.data>valueTwo) {
				node = node.left;
			}else if(node.data<valueOne && node.data<valueTwo) {
				node = node.right;
			}
			else
				return node;
		}
		return node;
	}

	Node successorNode(Node node, int data) {
		Node temp = root;
		while(node!=null) {
			if(node.data==data) {
				temp = successorHelper(node.right);
				return temp;
			}
			if(node.data>data) {
				node = node.left;
			}else if(node.data<data) {
				node = node.right;
			}
		}
		return temp;
	}

	private Node successorHelper(Node node) {

		while(node.left != null) {
			node = node.left;
		}
		return node;
	}
	/**
	 * Will not work if you are tryih to delete the root
	 * @param node
	 * @param value
	 */
	void deleteNode(Node node, int value) {
		Node temp = new Node();
		if(node==null) {
			System.out.println("Node doesnot exist");
		}else {
			node=getNodeTodelete(node, value);
			temp=(value==node.right.data)?node.right:node.left;
			System.out.println("Node to delete " + node.data + " temp " + temp.data);
		}

		if(temp.left==null && temp.right==null) {
			assert(node!=null);
			if(node.data>value) {
				node.left=null;
			}else {
				node.right=null;
			}
		}else if(temp.left==null) {
			assert(node!=null);
			if(node.data>value) {				
				node.left=temp.right;
				temp.right=null;
			}else {
				node.right=temp.right;
				temp.right=null;
			}
		}else if(temp.right==null) {
			assert(node!=null);
			if(node.data>value) {				
				node.left=temp.left;
				temp.left=null;
			}else {
				node.right=temp.left;
				temp.left=null;
			}
		}else {
			Node var = successorNode(node, value);
			int val = var.data;
			deleteNode(node, var.data);
			temp.data=val;

		}

	}

	Node getNodeTodelete(Node node, int value) {

		while(node.left.data !=value && node.right.data!=value) {
			if(node.data>value) {
				node = node.left;
			}else if(node.data<value) {
				node = node.right;
			}

		}
		return node;
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
			if(list.get(i)>=list.get(i+1)) {
				return false;
			}
		}
		return true;
	}
	Node getNode(int data) {
		Node node = new Node();
		node.data=data;
		node.left=null;
		node.right=null;

		return node;
	}



	public static void main(String[] args) {
		BST obj  = new BST();
		obj.insert(4);
		obj.insert(6);
		obj.insert(1);

		obj.insert(3);
		obj.insert(9);
		obj.insert(5);
		obj.insert(2);
		obj.insert(2);
		obj.insert(2);
		obj.insert(0);
		obj.insert(10);
		obj.insert(7);

		obj.inorder(obj.root);
		System.out.println("root " + obj.root.data);
		obj.preOrder(obj.root);
		System.out.println("Level Order");
		obj.levelOrder(obj.root);

		Node val = obj.lca(obj.root, 5, 7);
		System.out.println("LCA " + val.data);

		Node temp = obj.successorNode(obj.root, 1);
		System.out.println("successor  " + temp.data);

		obj.deleteNode(obj.root, 6);
		obj.levelOrder(obj.root);
		System.out.println("re Order ");
		obj.preOrder(obj.root);
		
		List<Integer> list = obj.getListOfInorder(obj.root, new ArrayList<Integer>());
		System.out.println(list);
		
		boolean flag = obj.checkSortedArray(list);
		System.out.println(flag);

	}

}
