package MyStack;
import java.util.ArrayList;
public class ArrayListStackExample
{
	public static void main(String[] args)
	{
		UserArrayListStack stack = new UserArrayListStack();
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

class UserArrayListStack<E>
{
	ArrayList<E> list = new ArrayList<>(10);
	
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
		return list.getLast();
	}
	public boolean empty()
	{
		return list.isEmpty();
	}
	public String toString()
	{
		return list.toString();
	}
	
}

