/*************************
 * 
 * Program: SwitchStatement.java
 * Author: Ernesto Armenta
 * Date: 03/16/2014
 * Description: Switch Statement Program
 * 
 */

import java.util.Scanner; //program uses class Scanner

public class SwitchStatement 
{

	// code base on flow chart
	public static void main(String[] args)
	{
		int thirsty;
		int breakfast;
		Scanner input = new Scanner(System.in);

		System.out.println("Hungry");
		System.out.println("Get in line");
		System.out.println("Buy lunch");
		System.out.println("If thirsty, enter 1 for yes and 2 for no: ");
		thirsty = input.nextInt(); //answered entered
		switch (thirsty)
		{
		   case 1: 
			   System.out.println("Had Breakfast?, enter 1 for yes and 2 for no:");
			   breakfast = input.nextInt(); //answered entered
			   switch (breakfast)
			   {
			   	case 1:
			   		System.out.println("Buy a diet coke");
			   		break;
			   	case 2:
			   		System.out.println("Buy a coke");
			   		break;
			   } break;
		   case 2:
			   System.out.println("Get Water");
			   break;
		}
		System.out.println("Eat lunch");
		System.out.println("Return tray");
		System.out.println("Leave");
	}

}