package pkg;

import java.util.Scanner;
import java.util.Random;


public class SinglyLinkedList {
	Node head;
	int size;


	/*
            Post-condition: The head will be null
    */
	public SinglyLinkedList() {
		head = null;
	}

	/*
        Receives an integer position, searches through the SinglyLinkedList for the position and returns the data at that positon
           If the position doesn't exist, it returns -1
    */
	public int get(int pos){
		Node last = head;
		for (int i = 0; i < pos-1; i++) {
			last = last.getNext();
		}
		return last.getData();
	}

	/*
        Insert a new Node at the given position with the data given
    */
	public void insert(int pos, int data){
		Node newNode = new Node(data);
		Node check = null;
		Node temp;

		if(head == null)    {
			head = newNode;
		}
		else if (pos == 0) {
			newNode.setNext(head);
			head = newNode;
		}
		else if (pos == 1) {
			newNode.setNext(head.getNext());
			head.setNext(newNode);
		}
		else {
			temp = head;
			int c = 0;
			while (c<pos) {
				try {
					if(temp.getNext() != null)  {
						temp = temp.getNext();
						check = temp.getNext();
						temp.getNext().getNext();
					}
				}
				catch (Exception e)    {
					break;
				}
				c++;
			}
			temp.setNext(newNode);
			if(pos<length(head))    {
				newNode.setNext(check);
			}

		}
	}

	/*
        Remove the node at the given position
        If no position exists, don't change the list
    */
	public void remove(int pos){
		Node temp = head;
		if(pos<length(head)) {
			for (int i = 0; i < pos-2; i++) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
	}

	/*
        Swap two Nodes with the two positions given
    */
	public void swap(int pos1, int pos2){

		Node curr1 = head.getNext();
		Node prev1 = head;


		int c = 1;
		while(curr1 != null) {
			if(c == pos1)   {
				break;
			}
			curr1 = curr1.getNext();
			c++;
		}

		Node curr2 = head.getNext();
		Node prev2 = head;
		c = 1;
		while(curr2 != null) {
			if(c == pos2)   {
				break;
			}
			curr2 = curr2.getNext();
			c++;
		}

		if(pos1 == 0)   {
			curr1 = head;
		}

		Node curr1Next = curr1.getNext();
		Node curr2Next = curr2.getNext();

		if(pos1 == 0) {
			head = curr2;
			prev2.setNext(curr1);
			curr2.setNext(curr1Next);
			curr1.setNext(curr2Next);
			return;
		}

		if(curr1 == null || curr2 == null)   {
			return;
		}
	}

	/*
        Print all data values in the LinkedList
    */
	public void printList(){
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	public int length(Node a) {
		if (a == null)  {
			return 0;
		}
		return 1 + length(a.getNext());
	}
}