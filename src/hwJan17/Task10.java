package hwJan17;


public class Task10 {
    public static void main(String[] args) {

/*
10) Write a java program to find the second largest number in the array?
*/
        int arr[]={1,2,5,4,6,3,2};
        int temp;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second lagest number of array is "+arr[arr.length-2]);


    }
}