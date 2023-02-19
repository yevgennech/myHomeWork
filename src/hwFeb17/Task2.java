package hwFeb17;
/*
We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code
 */
public class Task2 {
    public static void main(String[] args) {
        A a=new A(10, 20, 30);
        System.out.println("Sudent A average percentage is "+a.getPercentage(a.arr));

        B b=new B(40,40,40,40);
        System.out.println("Sudent B average percentage is "+b.getPercentage(b.arr));
    }
}
abstract class Marks{
    abstract double getPercentage(int[] arr);
}
class A extends Marks{
    int[] arr=new int[3];
    A(int a, int b, int c){
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
    }
    @Override
    double getPercentage(int[] arr) {
        double sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}
class B extends Marks{
    int[] arr=new int[4];
    B(int a, int b, int c, int d){
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
    }
    @Override
    double getPercentage(int[] arr) {
        double sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}


