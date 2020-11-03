/*
(Find the largest element) Write a method that finds the largest element in an array
of double values using the following header:
public static double max(double[] array)
 Write a test program that prompts the user to enter ten numbers, invokes this
method to return the maximum value, and displays the maximum value. Here is
a sample run of the program:

 */

import java. util. Scanner;

public class Opgave7_9 {
    public static void main(String[] args) {
        //Lav scanner
        Scanner input = new Scanner (System.in);

        //Lav an array med længde på 10
        double [] numbers = new double[10];

        //Prompt the user to enter 10 integers
        System.out.println("Enter 10 numbers ");
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = input.nextDouble();
            
        }

        System.out.println("The maximum number is: " + max(numbers));

    }

    public static double max(double[] array) {
         double max = array[0]; //maximum value
        for (int i = 0; i <array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
            
        }
        return max;


    }

}
