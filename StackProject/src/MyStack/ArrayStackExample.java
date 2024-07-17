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
	Object[] list = new Object[10];
	int len = -1;
	UserArrayStack()
	{
	}
	UserArrayStack(int cap)
	{
		list = new Object[cap];
	}
	
	public Object push(Object e)
	{
		if(!isFull())
		{
			list[++len] = e;
		}
		else
		{
			Object[] list1 = new Object[list.length * 2];
			for(int i=0; i<list1.length; i++)
			{
				if(i<list.length-1)
				{
					list1[i] = list[i];
				}
				else
				{
					len = i;
					break;
				}
			}
		}
		return e;
	}
	public Object pop()
	{
		Object obj = list[len-1];
		list[len-1] = null;
//		--len;
			return obj;
	}
	public Object peek()
	{
		return list[len];
	}
	public boolean empty()
	{
		if(len < (list.length))
			return true;
		return false;
	}
	public String toString()
	{
		return Arrays.toString(list);
	}
	
	private boolean isFull()
	{
		if(len == list.length-1)
			return true;
		return false;
	}
}
