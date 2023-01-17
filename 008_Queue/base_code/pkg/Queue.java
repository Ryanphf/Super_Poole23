package pkg;

import java.util.Scanner;
import java.util.Random;


public class Queue {
	/*  FIRST IN FIRST OUT  */
	Node head;
	Node tail;

	/*
        Postcondition: The top will be null.
    */
	public Queue() {
		head = null;
	}

	/*
        Adds a node to the end of the queue
    */
	public void enqueue(int data){

	}

	/*
        Removes a node from the front of the queue
    */
	public int dequeue(){
		head = head.getNext();
		return head.data;
	}

	/*
        Checks if the stack is empty.
    */
	public boolean isEmpty(){
		if(head == null) {
			return true;
		}
		return false;
	}

	/*
        Returns the value of the frontmost element
    */
	public int front(){
		return head.data;
	}

	/*
        Returns the value at the end of the queue
    */
	public int back(){
		return tail.data;
	}

}