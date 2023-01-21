package hwJan17;


public class Task3 {
    public static void main(String[] args) {

/*
3) Create a 2D array of integer values. Print the sum of all numbers.
 */
        int sum=0;
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];
            }
        }
        System.out.println("Sum of all elements of array is "+sum);




    }
}
