package pkg;


public class Stack {
	/*  LAST IN FIRST OUT  */
	Node top;

	/*
		Postcondition: The top will be null.
	*/
	public Stack() {
		top = null;

	}

	/*
		Insert a new Node on top of the stack
	*/
	public void push(int data){
		Node temp = new Node(data);
		if (top == null)	{
			top = temp;
		}
		else if (top.getNext() == null)	{
			temp.setNext(top);
			top = temp;
		}
		else {
			temp.setNext(top);
			top = temp;
		}
	}

	/*
		Removes the top node of the stack
	*/
	public int pop(){
		top = top.getNext();
		return top.getData();
	}

	/*
		Returns the top value of the stack. Doesn't pop.
	*/
	public int peek(){
		return top.getData();
	}

	/*
		Checks if the stack is empty.
	*/
	public boolean isEmpty(){
		if(top == null)	{
			return true;
		}
		return false;
	}
	public void DisplayStack(Stack s) {
		Node temp = top;
		while (temp != null)	{
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}
