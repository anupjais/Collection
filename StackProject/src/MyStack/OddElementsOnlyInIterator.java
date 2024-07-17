package MyStack;
import java.util.ArrayList;
import java.util.Iterator;
public class OddElementsOnlyInIterator 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=10; i++)
			list.add(i);
		System.out.println(list);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			if((it.next()) % 2 == 0)
				it.remove();
		}
		System.out.println(list);
//		it = list.iterator();
//		System.out.println("The odd elements are : ");
//		for(Integer element:list) {
//			System.out.println(element);
//		}
	}
}
