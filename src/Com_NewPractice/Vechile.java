package Com_NewPractice;

public class Vechile {
    int  id;
    String number;
    void speed(){
        System.out.println(" Lamborghini speed above 300kms per km");
    }

}
class Car extends Vechile{

    String model;
     void volkswogen(){
         System.out.println("volkswogen price above 2cr ");
     }
     void bmw(){
         System.out.println("bmw price above 1.5cr");
     }

}
class Bike extends Vechile{
    void ktm(){
        System.out.println(" ktm color is orange very high speed ");
    }
    void royalenfield(){
        System.out.println(" royal enfied lunched by landom ");
    }
}
