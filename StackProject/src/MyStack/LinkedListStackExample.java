package MyStack;
import java.util.Stack;
import java.util.LinkedList;
public class LinkedListStackExample
{
	public static void main(String[] args)
	{
		UserStack userStack = new UserStack();
		System.out.println("Empty : "+userStack.empty());
		for(int i=10; i<=100; i+=10)
		{
			userStack.push(i);
		}
		userStack.push("#Stack");
		
		System.out.println("Elements : "+userStack);
		System.out.println("Pop : "+userStack.pop());
		System.out.println("Peek : "+userStack.peek());
		System.out.println("Elements : "+userStack);
		System.out.println("Empty : "+userStack.empty());
		System.out.println("Search 10 index : "+userStack.search(10));
		System.out.println("Search \"Anup\" index : "+userStack.search("Anup"));
	}

}

class UserStack<E>
{
	LinkedList<E> list = new LinkedList<>();
	
	public E push(E e)
	{
		list.add(e);
		return e;
	}
	public E pop()
	{
		return list.removeLast();
	}
	public E peek()
	{
		return list.get(list.size()-1);
	}
	public boolean empty()
	{
		return list.isEmpty();
	}
	public int search(E e)
	{
		for(int i=list.size()-1, offset = 1; i>=0; i--, offset++)
		{
			if(e == ((list.get(i))))
			{
				return offset;
			}
		}
		return -1;
	}
	
	public String toString()
	{
		return list.toString();
	}
	
}
