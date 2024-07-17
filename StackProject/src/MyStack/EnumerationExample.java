package MyStack;
import java.util.*;
public class EnumerationExample
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.addElement(10);
		v.addElement("20");
		v.addElement(30);
		v.addElement("40");
		v.addElement("fifty");
		v.addElement(60);
		System.out.println(v);
		
		Enumeration e = v.elements();
		Vector<Integer> v2 = new Vector<>();
		while(e.hasMoreElements())
		{
			Object obj = e.nextElement();
			if(obj instanceof Integer)
			{
				Integer num = (Integer)obj;
				v2.addElement(num);
			}
		}
		System.out.println(v2);
		
	}

}
