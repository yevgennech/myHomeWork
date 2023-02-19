package hwFeb17;
/*Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does its own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount
 */
public class Task3 {
    public static void main(String[] args) {
        Sedan sed=new Sedan(10000, "Grey", 21);
        Truck tr=new Truck(20000, "Black", 1000);
        System.out.println(sed.calculateSalePrice());
        System.out.println(tr.calculateSalePrice());
    }
}

abstract class Car{
    double carPrice;
    String color;

    Car(double carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    abstract double calculateSalePrice();
}

class Sedan extends Car{
    double length;

    Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length=length;
    }
    @Override
    double calculateSalePrice() {
        return length>20 ? carPrice*0.95 : carPrice*0.9;
    }
}

class Truck extends Car{
    double weight;

    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }
    @Override
    double calculateSalePrice() {
        return weight>2000 ? carPrice*0.9 : carPrice*0.8;
    }
}


