package MyStack;
//import java.util.ArrayList;
import java.util.Arrays;
public class ArrayStackExample
{
	public static void main(String[] args)
	{
		UserArrayStack stack = new UserArrayStack();
		System.out.println("Is list empty : "+stack.empty());
		for(int i=5; i<105; i+=5)
			stack.push(i);
		System.out.println("Elements : "+stack);
		System.out.println("\nPop element : "+stack.pop());
		System.out.println("\nElements : "+stack);
		System.out.println("\nPeek element : "+stack.peek());
		System.out.println("\nElements : "+stack);
		System.out.println("\nIs list empty : "+stack.empty());
	}
}

class UserArrayStack
{
	int[] list = new int[10];
	int len = -1;
	UserArrayStack()
	{
		
	}
	UserArrayStack(int cap)
	{
		list = new int[cap];
	}
	
	public int push(int e)
	{
//		if
//		list.add(e);
//		return e;
	}
	public int pop()
	{
//		return list.removeLast();
	}
	public int peek()
	{
//		return list.getLast();
	}
	public boolean empty()
	{
		if(len)
//		return list.isEmpty();
	}
	public String toString()
	{
		return list.toString();
	}
	
}
