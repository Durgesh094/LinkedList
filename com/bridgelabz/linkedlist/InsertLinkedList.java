package com.bridgelabz.linkedlist;

public class InsertLinkedList {
	Node head;

	public void insert(int data) {
		Node nodeinsert = new Node();
		nodeinsert.data = data;
		nodeinsert.next = null;

		if (head == null) {
			head = nodeinsert;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = nodeinsert;
		}
	}
	
	//Insert node between head and tail
	public void insertLinkedList(int index, int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
        Node n = head;
        for(int i=0; i<index-1; i++) {
        	n = n.next;
        }
        node.next=n.next;
        n.next=node;
	}
	
	// printing node
	public void print() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}

	}
}
