package Q2L2;

import java.util.Scanner;

public class WorkingWithArrays
{
    // Header Method
    public static void myHeader(int exerciseNum)
    {
        System.out.println("=======================================================");
        System.out.printf("Lab Exercise: %d%n", exerciseNum);
        System.out.println("Prepared by: Tyler Liquornik");
        System.out.println("Student Number: 251271244");
        System.out.printf("Goal of this exercise: %s%n", "Working with arrays and conditional statements!");
        System.out.println("=======================================================");
    }

    // Footer Method
    public static void myFooter(int exerciseNum)
    {
        System.out.println("=======================================================");
        System.out.printf("Completion of Lab Exercise %d is successful!%n", exerciseNum);
        System.out.println("Signing off - Tyler");
        System.out.println("=======================================================");
    }

    public static double[] mma5methodTyler(int[] values)
    {
        // Total of values divisible by 5
        double totalDiv5 = 0;

        // Number of values divisible by 5
        double numOfDiv5 = 0;

        // Assume the max and min of values divisible by 5 to be the first element
        double maxDiv5 = values[0];
        double minDiv5 = values[0];

        for (int value : values)
        {
            if (value % 5 == 0)
            {
                totalDiv5 += value;
                numOfDiv5 ++;
                maxDiv5 = Math.max(value, maxDiv5);
                minDiv5 = Math.min(value, minDiv5);
            }
        }

        // Calculate the average of the numbers divisible by 5
        double averageDiv5;

        // Handle error case: no numbers divisible by 5, all results are zero for the sake of the exercise
        if (numOfDiv5 == 0)
        {
            averageDiv5 = 0;
            maxDiv5 = 0;
            minDiv5 = 0;
        }

        else
            averageDiv5 = totalDiv5 / numOfDiv5;

        // Print out how many numbers are divisible by 5
        System.out.printf("%s found %.0f numbers that are divisible-by-5%n", "Tyler", numOfDiv5);

        // Return the max, min, and average of numbers divisible by 5
        return new double[]{maxDiv5, minDiv5, averageDiv5, 251271244};
    }

    // Scanner object for user input
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        myHeader(2);

        // Prompt the user for array size
        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        // Build the array
        int[] values = new int[size];

        for (int i = 0; i < size; i++)
        {
            System.out.printf("Enter array value %d: ", i + 1);
            values[i] = input.nextInt();
        }

        System.out.println("\nHere is the result:\n");

        double[] results = mma5methodTyler(values);

        System.out.printf("Max: %.2f%n", results[0]);
        System.out.printf("Min: %.2f%n", results[1]);
        System.out.printf("Average: %.2f%n", results[2]);
        System.out.printf("My Student Number: %.0f%n", results[3]);

        myFooter(2);
    }
}
