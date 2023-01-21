package hwJan17;


public class Task11 {
    public static void main(String[] args) {

/*
11) Write a program to print out duplicate elements from an Array of Strings?
*/
        String[] sarray = {"aaa", "abd", "klm", "aaa", "okl", "gyu", "okl"};

        for (int i = 0; i < sarray.length-1; i++)
        {
            for (int j = i+1; j < sarray.length; j++)
            {
                if( (sarray[i].equals(sarray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+sarray[j]);
                }
            }
        }


    }
}