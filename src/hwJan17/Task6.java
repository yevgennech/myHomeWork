package hwJan17;


public class Task6 {
    public static void main(String[] args) {

/*
6) Write a program to swap 2 numbers without a temporary variable.
 */
        int x=10;
        int y=20;

        System.out.println("Before swap: x="+x+" y="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap: x="+x+" y="+y);



    }
}
