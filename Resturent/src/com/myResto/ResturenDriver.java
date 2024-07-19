package com.myResto;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class CustomerBill
{
	static int cusId = 0;
	String custName;
	long cusNum;
	ArrayList<String> food;
	double bill;
	public CustomerBill(String custName, long cusNum, ArrayList<String> food, double bill)
	{
		super();
		this.custName = custName;
		this.cusNum = cusNum;
		this.food = food;
		this.bill = bill;
		cusId++;
	}
	@Override
	public String toString() {
		return "CustomerBill [\033[94mcustName = \033[96m" + custName + ", \033[94mcusNum = \033[96m" + cusNum + ", \033[94mfood = \033[96m" + food + ", \033[92mTotal Amount = \033[96m" + bill + "]\033[0m";
	}
}

class Resturent
{
	List<CustomerBill> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	void addBill()
	{
		System.out.println("\n Add Bill");
		System.out.println();
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		System.out.print("Contact number : ");
		long conNum = sc.nextLong();
		ArrayList<String> food = new ArrayList<String>();
		System.out.print("Enter the quantity food : ");
		int qnt = sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=qnt; i++)
		{
			System.out.print("Enter the "+i+" item and price : ");
			String item = sc.nextLine();
			food.add(item);
		}
		double bill = 0;
		double[] bills = new double[food.size()];
		int indx = 0;
		for(String string : food)
		{
			String[] arr = string.split(" ");
			bills[indx++] = Double.parseDouble(arr[1]);
		}
		for(Double d : bills)
		{
			bill += d;
		}
		CustomerBill bill2 = new CustomerBill(name, indx, food, bill);
		list.add(bill2);
	}
	
	void displayBills()
	{
		ListIterator<CustomerBill> itr = list.listIterator();
		System.out.println("\n ***** Customer Details List *****");
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	void updateBill()
	{
		System.out.println("***** Update Bill *****");
		ListIterator<CustomerBill> itr = list.listIterator();
		System.out.println("\n Enter a CustomerId : ");
		int cusId = sc.nextInt();
		
		for (CustomerBill n : list)
		{
            if (n.cusId == cusId)
            {
            	System.out.println("Update Bill : ");
            	float uBill = sc.nextFloat();
                n.bill = uBill;
                break;
            }
        }
		System.out.println("\n 1. Name \n 2. Food item \n 3. Bill \n 0. EXIT");
		System.out.print("\nEnter your option : ");
		int opt = sc.nextInt();
		switch(opt)
		{
			case 1:
			{
				System.out.println("Enter name : ");
				String name = sc.nextLine();
				while(itr.hasNext())
				{
					CustomerBill n = itr.next();
					if(cusId == n.cusId)
					{
						n.cusName = name;
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("Food item : ");
				String food = sc.next();
				break;
			}
			case 3:
			{
				System.out.println("Bill : ");
				double bill = sc.nextDouble();
				while(itr.hasNext())
				{
					CustomerBill n = itr.next();
					if(cusId == n.cusId)
					{
						n.bill.set();
					}
				}
				break;
			}
			case 0:
			{
				System.exit(0);
			}
			default :
				System.out.println("Incorrect Input");
		}
	}
	void deleteBill()
	{
		ListIterator<CustomerBill> itr = list.listIterator();
		System.out.println("\n Enter a bill number : ");
		int cusId = sc.nextInt();
		while (itr.hasNext())
		{
			CustomerBill bill = itr.next();
			if(cusId == (bill.cusId))
				itr.remove();
		}
	}
}
public class ResturenDriver 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Resturent resturent = new Resturent();
		for(;;)
		{
			System.out.println("***** Welcome *****");
			System.out.println(" 1. Add Bill \n 2. Display Bill \n 3. Update Bill \n 4. Delete Bill \n 0. EXIT");
			System.out.print("\nEnter an option : ");
			int opt = sc.nextInt();
			switch (opt)
			{
				case 1:
					{
						resturent.addBill();
						break;
					}
				case 2:
				{
					resturent.displayBills();
					break;
				}
				case 3:
				{
					resturent.updateBill();
					break;
				}
				case 4:
				{
					resturent.deleteBill();
					break;
				}
				case 0:
				{
					System.exit(0);
				}
				default:
					System.out.println("Incorrect Option.");
			}
		}
	}

}
