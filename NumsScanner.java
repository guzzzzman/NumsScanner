// Jose Guzman
// September 17, 2023
// Description:  Scanner sample program
// File name: NumsScanner.java
// To Compile in terminal type:  javac NumsScanner.java
// To Run in terminal type: java NumsScanner

import java.util.*; // needed to access the Scanner class

public class NumsScanner
{
  public static void main (String[] args)
  {
    double num1;

    //With Scanner,
    //we can enter a numerical value without parsing it:
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");

    num1 = sc.nextDouble();
    System.out.println("You entered: "+ num1);
    System.out.println("and we can do math with it "+
                                num1+" * 5 = "+ num1*5);

  }
}
/*
javac NumsScanner.java
java NumsScanner     
Enter a number:4
You entered: 4.0
and we can do math with it 4.0 * 5 = 20.0
*/