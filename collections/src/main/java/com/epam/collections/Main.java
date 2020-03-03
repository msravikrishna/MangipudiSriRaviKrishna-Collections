package com.epam.collections;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
		CustomizedList<Integer> c=new CustomizedList
				<Integer>();
		Scanner scan=new Scanner(System.in);
		String ch1="y";
		do
		{
			System.out.println("Enter your choice: ");
			System.out.println("1.Add \n2.Fetch \n3.Remove \n4.Print");
			int ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter how many elements you want");
				int n=scan.nextInt();
				System.out.println("Enter elements: ");
				for(int i=0;i<n;i++)
				{
					int num=scan.nextInt();
					c.add(num);
				}
				System.out.println("The list is created");
				break;
			case 2:

				System.out.println("Enter the index of the element you want to fetch (0-n) : ");
				int index1=scan.nextInt();
				System.out.println("The element at the index "+index1+" is "+c.get(index1));
				break;
				
			case 3:
				System.out.println("Enter the index of element you want to remove (0-n) :");
				int index=scan.nextInt();
				c.remove(index);
				System.out.println("The element is removed Successfully!!!");
				break;

			case 4:
				System.out.println("The elements in the list are : "+c);
				break;
				
			default:
				System.out.println("Enter correct choice");
			}
			System.out.println("Do you want to continue(y/n)?");
			ch1=scan.next();
		}while(ch1.equalsIgnoreCase("y"));
		scan.close();
	}
}
