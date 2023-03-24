package practice.binaryheap;

public class BinaryHeapArray {

	Integer[] heap = new Integer[15];
	int root=0, lastIndex=0;
	void insert(int value) {
		if(lastIndex==0) {
			heap[1]=value;
			root=1;
			lastIndex++;
		}else {
			lastIndex++;
			heap[lastIndex]=value;
			heapify(lastIndex);
		}
	}

	void heapify(int lastIndex){
		int index=lastIndex;
		
		while(index>1) {
			int parentIndex=index/2;
			if(heap[parentIndex]>heap[index]) {
				heap[parentIndex]=heap[parentIndex]+heap[index];
				heap[index]=heap[parentIndex]-heap[index];
				heap[parentIndex]=heap[parentIndex]-heap[index];
				index=parentIndex;
			}else {
				break;
			}
		}
	}
	void delete() {
		System.out.println("Delete Method");
		if(root==0) {
			System.out.println("Empty Heap");
		}else {
			heap[root]=heap[lastIndex];
			lastIndex--;
			heapifyTopToBottom();
		}
	}
	/*
	 * it will break
	 */
	void heapifyTopToBottom() {
		System.out.println("Hepify");
		int i=root;
		while(i<lastIndex/2) {
			if(heap[i]>heap[i*2]) {
				int temp=heap[i*2];
				heap[i*2]=heap[i];
				heap[i]=temp;
				i=i*2;
			}else if(heap[i]>heap[(i*2)+1]) {
				int temp=heap[(i*2)+1];
				heap[(i*2)+1]=heap[i];
				heap[i]=temp;
				i=(i*2)+1;
			}else {
				break;
			}
		}
	}
	
	int getValue() {
		return heap[root];
	}

	void levelorder() {
		for(int i=root;i<=lastIndex;i++) {
			System.out.println(heap[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryHeapArray obj = new BinaryHeapArray();
		obj.insert(5);
		obj.insert(2);
		obj.insert(8);
		obj.insert(1);
		obj.insert(3);
		obj.insert(7);
		
		obj.levelorder();
		
		System.out.println(obj.getValue());
		obj.delete();
		System.out.println("After Delete");
		obj.levelorder();
		obj.delete();
		System.out.println("After Delete");
		obj.levelorder();
	}

}
