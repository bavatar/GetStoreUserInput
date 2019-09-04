// John Anderjaska
// 9-4-19
// Getting and Storing User Input
// Complete the following program. Use the Scanner class to read the following string into variables.
// Input String: "P Sherman 42 Wallaby Way Sydney"
// Variables: firstInitial,lastName, houseNumber,streetName,streetType,city

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int houseNumber;
        String firstInitial, lastName, streetName, streetType, city;

        // Create a new Scanner object.  Constructor
        Scanner keyboard= new Scanner(System.in);

        // Request data from the keyboard
        System.out.println("Enter House Number: ");
        houseNumber = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter First Initial: ");
        firstInitial = keyboard.nextLine(); 		// Use with strings

        System.out.println("Enter Last Name: ");
        lastName= keyboard.nextLine();

        System.out.println("Enter Street Name: ");
        streetName = keyboard.nextLine();

        System.out.println("Enter Street Type: ");
        streetType = keyboard.nextLine();

        System.out.println("Enter City: ");
        city= keyboard.nextLine();

        //String myAnswer = keyboard.next(); // can't have spaces in input
        //double myDouble = keyboard.nextDouble();
        //System.out.println("Your string: " + myAnswer);
        //System.out.println("Your number " + myNumber);

        // Output
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
