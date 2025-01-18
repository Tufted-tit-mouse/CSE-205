 /**------------HW 4.3----------------
 * CLASS: H01_43 (H01_43.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */

import java.io.File; // Allows File to be created/directory to exist through File Class

import java.util.Scanner; // Include this line so you can use the Scanner class. 

import java.io.FileNotFoundException; // Include to utilize  File not found class if a File cannot be opened for writng or doesn't exist.

import java.io.PrintWriter; // include to utilize Scanner class


public class H01_43 
{
public static void main(String argts[]) throws FileNotFoundException
{
try{
Scanner in = new Scanner(System.in);  // Create a Scanner object to read keyboard input 

System.out.println("Please enter the name of a Java source code file "); // Prompts User for Input

String UserInputFileName = in.nextLine();   //reads string of UserInput

File UserJavaFile= new File(UserInputFileName);  // Create memory space for file then Intializes it with specific Filename.

Scanner in2= new Scanner(UserJavaFile); // Scans File for data

Scanner in3 = new Scanner(System.in);  // Create a Scanner object to read keyboard input 

System.out.print("Please enter the name of a Java text code file to outsource data to") ; // Prompts User for Output

String UserOutputTextFileName =in3.nextLine(); //reads string of UserInput of output Text File

File UserTextFile = new File(UserOutputTextFileName);
// Create memory space for file and intiates it with specific filename 


/*PrintWriter out.printf = new PrintWriter(UserOutputFileName); // Print Output to Text File    */

while (in2.hasNextLine())
{
String Lines = in2.nextLine();
PrintWriter outputTxt = new PrintWriter(UserTextFile);
outputTxt.printf("%3d", Lines);

outputTxt.close();
}
System.out.print(UserTextFile); // Verify the Text File has the correct values and Prefix.

in.close();
in2.close();
in3.close();
}
catch (FileNotFoundException ex)
{
  System.out.println("The file you entered is not valid");   
}

}
}
