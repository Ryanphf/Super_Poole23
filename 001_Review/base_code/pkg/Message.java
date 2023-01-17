package pkg;
import java.util.*;
import java.io.*;

public class Message {
	private ArrayList <Message> children = new ArrayList<>();
	private String author;
	private String Subject;
	private String body;
	private int replynum;

	// Default Constructor
	public Message() {

	}

	// Parameterized Constructor
	public Message(String auth, String subj, String bod, int i) {
		author = auth;
		Subject = subj;
		body = bod;
		replynum = i;
	}

	// This function is responsible for printing the Message
	// (whether Topic or Reply), and all the Message's "subtree" recursively:

	// After printing the Message with indentation n and appropriate format (see output details),
	// it will invoke itself recursively on all the Replies inside its childList,
	// incrementing the indentation value at each new level.

	// Note: Each indentation increment represents 2 spaces. e.g. if indentation ==  1, the reply should be indented 2 spaces,
	// if it's 2, indent by 4 spaces, etc.
	public void print(int indentation){
		System.out.println(author+": "+Subject+" "+body+" "+ replynum);
		for(int i =0; i<indentation+1;i++)	{
			System.out.print("  ");
		}
		for(int i = 0; i<children.size();i++)	{
			children.get(i).print(indentation+1);
		}
	}

	// Default function for inheritance
	public boolean isReply(){
		return false;

	}

	// Returns the subject String
	public String getSubject(){
		return Subject;

	}

	// Returns the ID
	public int getId(){
		return replynum;

	}

	// Adds a child pointer to the parent's childList.
	public void addChild(Message child){
		children.add(child);
	}

}
