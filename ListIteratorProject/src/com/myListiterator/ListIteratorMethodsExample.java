package com.myListiterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.ArrayList;
public class ListIteratorMethodsExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList arrayList= new ArrayList();
		for(int i=2; i<20; i+=2)
			arrayList.add(i);
		System.out.println("\033[H \033[2J");
		System.out.println("Elements are : "+arrayList);
		
		ListIterator itr = arrayList.listIterator();
		
		int cnt = 0;
		for(;;)
		{
			System.out.println("\n 1. hasNext() \n 2. hasPrevious() \n 3. next() \n 4. previous() \n 5. remove() ");
			System.out.println(" 6. nextIndex() \n 7. previousIndex() \n 8. set() \n 9. add() \n 0. EXIT ");
			System.out.print("\nEnter you choice : ");
			int opt = sc.nextInt();
			
			switch(opt)
			{
				case 1:
					{
						System.out.println("Elements are : "+arrayList);
						System.out.println("Has next element : "+itr.hasNext());
						cnt++;
					}
					break;
				case 2:
					{
						System.out.println("Elements are : "+arrayList);
						System.out.println("Element is : "+itr.next());
						itr.previous();
						if(cnt>0)
						{
							System.out.println("Has previous element : "+itr.hasPrevious());
							cnt--;
						}
						else
							System.out.println("There is no previous.");
					}
					break;
				case 3:
					{
						System.out.println("Elements are : "+arrayList);
						System.out.println("The next element : "+itr.next());
						itr.previous();
					}
					break;
				case 4:
					{
						System.out.println("Elements are : "+arrayList);
						System.out.println("Element is : "+itr.next());
						itr.previous();
						if(itr.hasPrevious())
							System.out.println("Has previous element : "+itr.previous());
						else
							System.out.println("There is no previous.");
					}
					break;
				case 5:
					{
						System.out.println("Elements are : "+arrayList);
						System.out.println("Element is : "+itr.next());
						itr.previous();
						itr.remove();
						System.out.println("After remove elements are : "+arrayList);
//						System.out.println("The removed element : "+itr.remove());
					}
					break;
//			 6. nextIndex() \n 7. previousIndex() \n 8. set() \n 9. add() \n 0. EXIT ");
				case 6:
					{
						System.out.println("Elements are : "+arrayList);
						System.out.println("Element is : "+itr.next());
						itr.previous();
						if(itr.hasNext())
							System.out.println("The next index : "+itr.nextIndex());
						else
							System.out.println("There is no next index.");
					}
					break;
				case 7:
					{
						System.out.println("Elements are : "+arrayList);
						System.out.println("Element is : "+itr.next());
						itr.previous();
						if(itr.hasPrevious())
							System.out.println("The previous index : "+itr.previousIndex());
						else
							System.out.println("There is no previous index.");
					}
					break;
				case 8:
					{
						System.out.print("Enter an element : ");
						String ele = sc.next();
						itr.set(ele);
						System.out.println("Elements are : "+arrayList);
					}
					break;
				case 9:
					{
						System.out.print("Enter an element : ");
						String ele = sc.next();
						itr.add(ele);
						System.out.println("Elements are : "+arrayList);
					}
					break;
				case 0:
					System.out.println("Thank you for using my application..");
					System.exit(0);
				default :
					System.out.println("Ivalid Option");
			}
		}
		
//			System.out.println("Elements are : "+arrayList);
	}
}
