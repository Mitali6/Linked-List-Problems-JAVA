package LinkedList;

public class LinkedList {
	
	Node head;
	
	public LinkedList() {
		head = null; 
	}
	
	public void printLinkedList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("\n");
	}
	
	public void insertAtBeginning(int key) {
		Node temp = new Node(key);
		temp.next = head;
		head = temp;
	}

	public void insertAtEnd(int key) {
		Node temp = head;
		if(temp != null) {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(key);
		} else {
			head = new Node(key);
		}
	}

	public void insertInBetween(int insertAfterKey, int key) {
		if(head == null) {
			System.out.println("Node can't be inserted as Linked List is empty");
		} else {
			Node temp = head;
			while(temp != null && temp.data != insertAfterKey) {
				temp = temp.next;
			}
			if(temp != null) {
				Node newNode = new Node(key);
				newNode.next = temp.next;
				temp.next = newNode;
			} else {
				System.out.println("Node doesn't exist");
			}
		}
	}
	
	public void deleteNode(int keyToBeDeleted) {
		if(head == null) {
			System.out.println("Node can't be deleted as Linked List is empty");
		} else {
			Node temp = head, prev = null;
			if(temp.data == keyToBeDeleted) {
				head = temp.next;
				return;
			}
			while(temp != null && temp.data != keyToBeDeleted) {
				prev = temp;
				temp = temp.next;
			}
			if(temp == null) {
				System.out.println("Node to be deleted doesn't exist");
				return;
			} 
			prev.next = temp.next;
		}
	}

	public int findMiddleNodeOfLinkedList(Node head) {
		
		if(head == null) {
			System.out.println("Linked List is empty");
			return -1;
		}
		
		Node slow = head, fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

}
