package hwJan17;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

/*
2)Using Scanner create an array of countries. When an array is created,
retrieve all values from it and while retrieving those values print capital
for each country. (use 2 different loops).
 */

        String[] capital = {"Lisbon", "Madrid", "Paris", "Berlin", "Warsaw", "Kiev", "Prague", "Rome"};
        String[] country = {"Portugal", "Spain", "France", "Germany", "Poland", "Ukraine", "Czech Republic", "Italy"};
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < country.length; i++) {
            for (int j = 0; j < capital.length; j++) {
               if (i==j) {
                    System.out.println(capital[j]+" is a capital of " + country[i]);
                }

            }
        }





    }
}
