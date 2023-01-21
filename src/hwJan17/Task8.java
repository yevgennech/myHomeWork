package hwJan17;


public class Task8 {
    public static void main(String[] args) {

/*
8) Write a Java Program to print the first 10 numbers of Fibonacci series.
*/

        // Given Number N
        int N = 10;
        int num1 = 0, num2 = 1;
        int counter = 0;

        // Iterate till counter is N
        while (counter < N) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }


    }
}