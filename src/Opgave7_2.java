import java.util.Scanner;

public class Opgave7_2 {

    public static void main(String[] args) {
        int[] array = new int[10];

        //prompt the user to enter integers
        System.out.println("Enter 10 integers");

        //array
        fill(array);

        //Display the integers in reverse order
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        System.out.println();


        }

        public static void fill ( int[] array){
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < array.length;i++)
                array[i] = input.nextInt();


        }
    }

