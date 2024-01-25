package Q1L1;

import java.util.Scanner;

public class TestingExecutionTime
{
    // Header Method
    public static void myHeader(int exerciseNum)
    {
        System.out.println("=======================================================");
        System.out.printf("Lab Exercise: %d%n", exerciseNum);
        System.out.println("Prepared by: Tyler Liquornik");
        System.out.println("Student Number: 251271244");
        System.out.printf("Goal of this exercise: %s%n", "Checking the code execution time!");
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

    // Calculate the factorial of an integer by the recursive method
    public static double recursiveMethodForFactorial(int n)
    {
        // End at the base case of 0! = 1
        if (n == 0)
            return 1;

        // Recursive call
        else
            return n * recursiveMethodForFactorial(n - 1);
    }

    // Calculate the factorial of an integer by the recursive method
    public static double iterativeMethodForFactorial(int n)
    {
        // Build up result from base
        double result = 1;

        // Multiply by each number up to n
        for(int i = 1; i <= n; i++)
        {
            result *= i;
        }

        return result;
    }

    // Scanner object for user input
    public static Scanner input = new Scanner(System.in);

    // Driver Method
    public static void main(String[] args)
    {
        // Print Header
        myHeader(1);

        // User input number to take factorial of
        int n;

        // Loop until user inputs a positive number
        do
        {
            System.out.print("Enter an integer number: ");
            n = input.nextInt();

            if (n < 0)
                System.out.println("\nYou can't enter a negative number, try again");
        }

        while (n < 0);

        // Start time: method 1
        long initialTime1 = System.nanoTime();

        // Method 1
        double result = 1;
        for(int i = 1; i <= n; i++)
        {
            result *= i;
        }

        // End time: method 1
        double executionTime1 = (((double) System.nanoTime() - initialTime1) / 1000000000);

        // Print results
        System.out.printf("%n%d! by iterative solution in main is %.0e%n", n, result);
        System.out.printf("Time taken by iterative solution in main: %.2es", executionTime1);

        // Start time: method 2
        long initialTime2 = System.nanoTime();

        // Method 2
        result = iterativeMethodForFactorial(n);

        // End time: method 2
        double executionTime2 = (((double) System.nanoTime() - initialTime2) / 1000000000);

        // Print results
        System.out.printf("%n%d! by iterative method call is %.0e%n", n, result);
        System.out.printf("Time taken by iterative method call: %.2es", executionTime2);

        // Start time: method 3
        long initialTime3 = System.nanoTime();

        // Method 3
        result = recursiveMethodForFactorial(n);

        // End time: method 3
        double executionTime3 = (((double) System.nanoTime() - initialTime3) / 1000000000);

        // Print results
        System.out.printf("%n%d! by recursive method call is %.0e%n", n, result);
        System.out.printf("Time taken by recursive method call: %.2es%n", executionTime3);

        // Print Footer
        myFooter(1);
    }
}