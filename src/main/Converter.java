package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args){
		
		// creates scanner to gather input data
		int mS = 0;
		Scanner scanner = new Scanner(System.in);
		
		// loops menu option 
		while(mS != 4)
		{	
			// displays menu in loop
			System.out.println("PLEASE SELECT A MENU SELECTION & PRESS ENTER:"
					+ "\n\n1: Cups to Teaspoons"
					+ "\n2: Miles to Kilometers"
					+ "\n3: Yards to Feet"
					+ "\n4: QUIT\n");
			
			// gathers next integer input for selection
			mS = scanner.nextInt();
			System.out.print("\n");
			
		// cases 1-4 with conversions; mS as the switcher
		switch(mS) 
		{
		case 1:
			
			// initializes cup, our input data
			int cups = 0;
			
			//conversion variable
			int teaspoons = 0;
			
			// prompts user his selection
			System.out.println("**CUPS TO TEASPOONS**"
					+ "\nEnter CUPS: ");
			
			// scanner reads next input
			cups = scanner.nextInt();
			// conversion into variable so we can display answer
			teaspoons = cups * 48;
			// displays desired conversion with the answer
			System.out.println("\n" + cups + " cups coverts to " + teaspoons + " teaspoons.\n");
			
			break;
		case 2:
			
			// initializes miles, our input data
			int miles = 0;
			
			// conversion variable 
			float km = 0f;
			
			
			// prompts user his selection
			System.out.println("**MILES TO KILOMETERS**"
					+ "\nENTER MILES: ");
			
			// scanner reads next input
			miles = scanner.nextInt();
			
			// conversion into variable so we can display answer
			km = miles * 1.609344f;
			
			// displays desired conversion with the answer
			System.out.println("\n" + miles + " miles converts to " + km + " kilometers.\n");
			
			break;
		case 3:
			
			// initializes yards our, input data
			int yards = 0;
			
			//conversion variable
			int feet = 0;
			
			// prompts user his selection
			System.out.println("**YARDS TO FEET**"
					+ "\nENTER YARDS: ");
			
			// scanner reads next input
			yards = scanner.nextInt();
			
			// conversion into variable so we can display answer
			feet = yards * 3;
			
			// displays desired conversion with the answer
			System.out.println("\n" + yards + " yards converts to " + feet + " feet.\n");
			
			break;
		case 4:
			
			// if 4 is selected a exit prompt is shown and program is terminated
			System.out.println("**THANK YOU FOR USING EDWIN'S UNIT CONVERSION PROGRAM**"
					+ "\n\t  **** TERMINATING PROGRAM ****");
			
			break;
			
		// if input selection is not 1-4 error message is displayed
		default: System.out.println("***INVALID MENU SELECTION. TRY ANOTHER INPUT 1-4***\n");
			
			} // end of switch
			
		} // end of while 
		
		// closing scanner
		scanner.close(); 
		
	} // end of main method
	
	
} // end of class
