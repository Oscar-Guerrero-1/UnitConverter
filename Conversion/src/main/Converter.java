package main;
/* Converter.java
 * program to Set up a loop that will continue to allow a user to convert 
 * between different units as long as the user doesn't choose to quit. 
 * Last edited 6/12/21 by Oscar Guerrero
 */
import java.util.*;
public class Converter {
	
	// collect the users input
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int number = 0;
		int newNumber = 0;
		
		do{
			System.out.println("\nPlease select an option by its number: "
					+ "\n1. Cups to Teaspoons "
					+ "\n2. Miles to Kilometers "
					+ "\n3. US Gallons to Imperial Gallons "
					+ "\n4. Quit");
			
			number =  input.nextInt();
			double convert;
			
			switch(number) {
			case 1:
				System.out.println("\nPlease enter the amount of Cups.");
				newNumber = input.nextInt();
				
				convert = covertToTeaspoons(newNumber);
				System.out.println(newNumber + " cups is " + 
				+ convert + " Teaspoons");
				
				break;
				
			case 2:
				System.out.println("\nPlease enter the amount of Miles.");
				newNumber = input.nextInt();
				convert = covertToKilometers(newNumber);
				System.out.println(newNumber + " Miles is " + 
				+ convert + " Kilometers");
				
				break;
				
			case 3:
				System.out.println("\nPlease enter the amount of Gallons.");
				newNumber = input.nextInt();
				convert = covertToImperialGallon(newNumber);
				System.out.println(newNumber + " Gallons is " + 
				+ convert + " ImperialGallons");
				
				break;
				
			case 4:
				System.out.println("\nProgram closing.");
				break;
				
			default: 
				System.out.println("\nPlease choose a number from 1-4.");
			}
				
		
		}while(number != 4); // end while()
		
		// close the scanner
		input.close();
		
	} // end main
	
	public static double covertToTeaspoons(double cups) {
		
		double teaspoons = cups * 48;
		return teaspoons;
	}
	
	public static double covertToKilometers(double miles) {
		
		double kilometers = miles * 1.609344;
		return kilometers;
	}
	
	public static double covertToImperialGallon(double gallons) {
		
		double imperialGallon = gallons/1.20095046;
		return imperialGallon;
	}
	
} // end class Converter
