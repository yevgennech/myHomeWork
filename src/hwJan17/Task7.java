package hwJan17;


import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

/*
7) Write a java program to check whether a given number is prime or not?
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is truly prime number or not: ");
        int num = sc.nextInt();
        boolean isPrime;

        if (num <= 1) {
            isPrime = false;
        } else {
            isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if ((num % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is a non-prime number");
        }



    }
}