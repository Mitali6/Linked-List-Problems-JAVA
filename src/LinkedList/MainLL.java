package LinkedList;

public class MainLL {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insertInBetween(4, 5);
		System.out.println("List after trying to insert a node with value 5 after a node whose value is 4, when linked list is empty");
		list.printLinkedList();
		
		list.deleteNode(7);
		System.out.println("List after attempting to delete a node with value 7 when linked list is empty");
		list.printLinkedList();
		
		list.insertAtEnd(3);
		System.out.println("List after inserting a new node at end with value 3:");
		list.printLinkedList();
		
		list.insertAtBeginning(2);
		System.out.println("List after inserting a new node at beginning with value 2:");
		list.printLinkedList();

		list.insertAtEnd(4);
		System.out.println("List after inserting a new node at end with value 4:");
		list.printLinkedList();

		list.insertAtBeginning(1);
		System.out.println("List after inserting a new node at beginning with value 1:");
		list.printLinkedList();
		
		list.insertAtEnd(6);
		System.out.println("List after inserting a new node at end with value 6:");
		list.printLinkedList();
		
		System.out.println("The middle node of given linked list with odd number of nodes has key " + list.findMiddleNodeOfLinkedList() + "\n");
		
		list.insertInBetween(4, 5);
		System.out.println("List after inserting a new node in between with value 5 after a node whose value is 4:");
		list.printLinkedList();
		
		System.out.println("The middle node of given linked list with even number of nodes has key " + list.findMiddleNodeOfLinkedList() + "\n");
		
		list.insertInBetween(7, 8);
		System.out.println("List after trying to insert a node with value 8 after a node with value 7, which does not exist");
		list.printLinkedList();
		
		list.deleteNode(1);
		System.out.println("List after deleting a node which is at beginning with value 1");
		list.printLinkedList();
		
		list.deleteNode(3);
		System.out.println("List after deleting a node in between with value 3");
		list.printLinkedList();
		
		list.deleteNode(6);
		System.out.println("List after deleting a node at end with value 6");
		list.printLinkedList();
		
		list.deleteNode(7);
		System.out.println("List after attempting to delete a node with value 7 that does not exist");
		list.printLinkedList();

		list.insertAtEnd(1);
		System.out.println("List after inserting a new node at end with value 6:");
		list.printLinkedList();

		list.insertAtEnd(1);
		System.out.println("List after inserting a new node at end with value 7:");
		list.printLinkedList();

		list.insertInBetween(2, 3);
		System.out.println("List after inserting a new node in between, after key with value 2:");
		list.printLinkedList();

		list.insertAtEnd(3);
		System.out.println("List after inserting a new node at end with value 3:");
		list.printLinkedList();

		System.out.println("The middle node of given linked list with even number of nodes has key " + list.findMiddleNodeOfLinkedList() + "\n");

		System.out.println("There are " + list.countTheOccurrenceOfAValue(list.head, 1) + " nodes with value 1.\n");

		list.insertAtBeginning(3);
		System.out.println("List after inserting a new node at beginning with value 3:");
		list.printLinkedList();

		list.insertAtBeginning(3);
		System.out.println("List after inserting a new node at beginning with value 3:");
		list.printLinkedList();

		System.out.println("There are " + list.countTheOccurrenceOfAValue(list.head, 3) + " nodes with value 3.\n");

		System.out.print("Creating a circular linked list: ");
		LinkedList circularList = new LinkedList();
		circularList.head = new Node(1);
		System.out.print(circularList.head.data + " ");
		circularList.head.next = new Node(2);
		System.out.print(circularList.head.next.data + " ");
		circularList.head.next.next = new Node(3);
		System.out.print(circularList.head.next.next.data + " ");
		circularList.head.next.next.next = new Node(4);
		System.out.print(circularList.head.next.next.next.data + "\n");
		circularList.head.next.next.next.next = circularList.head;

		System.out.println("List2 is circular: " + circularList.isCircularLinkedList());
		System.out.println("List1 is circular: " + list.isCircularLinkedList());
		System.out.println("Number of nodes in circular linked list are " + circularList.countNodesInCircularLinkedList());


	}
}
