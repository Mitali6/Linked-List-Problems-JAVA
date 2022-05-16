package LinkedList;

public class MainLL {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insertInBetween(4, 5);
		System.out.println("List after trying to insert a node when linked list is empty");
		list.printLinkedList();
		
		list.deleteNode(7);
		System.out.println("List after attempting to delete a node when linked list is empty");
		list.printLinkedList();
		
		list.insertAtEnd(3);
		System.out.println("List after inserting a new node at end:");
		list.printLinkedList();
		
		list.insertAtBeginning(2);
		System.out.println("List after inserting a new node at beginning:");
		list.printLinkedList();

		list.insertAtEnd(4);
		System.out.println("List after inserting a new node at end:");
		list.printLinkedList();
		
		
		list.insertAtBeginning(1);
		System.out.println("List after inserting a new node at beginning:");
		list.printLinkedList();
		
		list.insertAtEnd(6);
		System.out.println("List after inserting a new node at end:");
		list.printLinkedList();
		
		System.out.println("The middle node of given linked list with even number of nodes has key " + list.findMiddleNodeOfLinkedList(list.head) + "\n");
		
		list.insertInBetween(4, 5);
		System.out.println("List after inserting a new node in between:");
		list.printLinkedList();
		
		System.out.println("The middle node of given linked list with odd number of nodes has key " + list.findMiddleNodeOfLinkedList(list.head) + "\n");
		
		list.insertInBetween(7, 8);
		System.out.println("List after trying to insert a node after a node which does not exist");
		list.printLinkedList();
		
		list.deleteNode(1);
		System.out.println("List after deleting a node which is at beginning");
		list.printLinkedList();
		
		list.deleteNode(3);
		System.out.println("List after deleting a node in between");
		list.printLinkedList();
		
		list.deleteNode(6);
		System.out.println("List after deleting a node at end");
		list.printLinkedList();
		
		list.deleteNode(7);
		System.out.println("List after attempting to delete a node that does not exist");
		list.printLinkedList();
		
	}
}
