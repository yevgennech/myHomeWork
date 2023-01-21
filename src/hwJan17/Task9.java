package hwJan17;


public class Task9 {
    public static void main(String[] args) {

/*
9) Maximum and minimum number in the array?
*/
        int[] arr={6,2,4,5,3,9,7,8,1};
        int min=arr[0];
        int max=arr[0];

        for(int i=0; i< arr.length; i++) {
            if(arr[i]>max) {
                max=arr[i];
            } else if(arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("min="+min+" max="+max);


    }
}