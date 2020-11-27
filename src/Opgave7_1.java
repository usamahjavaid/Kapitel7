/*
(Assign grades) Write a program that reads student scores, gets the best score, and
then assigns grades based on the following scheme:
Grade is A if score is >= best -5
Grade is B if score is >= best -10;
Grade is C if score is >= best -15;
Grade is D if score is >= best -20;
Grade is F otherwise.
The program prompts the user to enter the total number of students, and then
prompts the user to enter all of the scores, and concludes by displaying the grades.
Here is a sample run:

 */

import java.util.Scanner;

public class Opgave7_1 {
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter number of students
        System.out.println("Enter number of students ");

        int numberOfStudents = Integer.parseInt(input.nextLine());
        //Prompt the user to enter all scores

        System.out.println("Enter " + numberOfStudents + " scores");
        String scoreInput = input.nextLine();
        String[] numberStrs = scoreInput.split(" ");

        int[] scores = new int[numberStrs.length];

        for (int i = 0; i < numberStrs.length; i++) {
            scores[i] = Integer.parseInt(numberStrs[i]);

        }

        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        int best = max;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= best - 5) {
                System.out.printf("Student %s score is %s and grade is A\n", i, scores[i]);

            } else if (scores[i] >= best - 10) {
                System.out.printf("Student %s score is %s and grade is B\n", i, scores[i]);

            } else if (scores[i] >= best - 15) {
                System.out.printf("Student %s score is %s and grade is C\n", i, scores[i]);

            } else if (scores[i] >= best - 20) {
                System.out.printf("Student %s score is %s and grade is D\n", i, scores[i]);

            } else
                System.out.printf("Student %s score is %s and grade is F\n", i, scores[i]);
        }
    }

    }








