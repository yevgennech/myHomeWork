package hwJan17;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

/* 1) Using Scanner create an array of integer values. After
 the array is created, calculate the sum of all stored
 elements in that array.
 */
        int sum=0;
        int[] numbers=new int[5];
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter next number: ");
            numbers[i]=scanner.nextInt();
            sum=sum+numbers[i]; // adding all the numbers
        }
        System.out.println("Total:"+sum);




    }
}
