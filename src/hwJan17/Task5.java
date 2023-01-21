package hwJan17;


public class Task5 {
    public static void main(String[] args) {

/*
5) Create a 2D array of integers. Develop a program which will calculate the sum of
  even and odd numbers for that array.
 */
        int evenSum=0;
        int oddSum=0;
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]%2==0) {
                    evenSum+=matrix[i][j];
                } else {
                    oddSum+=matrix[i][j];
                }
            }
        }
        System.out.println("evenSum="+evenSum+" oddSum="+oddSum);

    }
}
