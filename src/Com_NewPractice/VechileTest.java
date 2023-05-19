package Com_NewPractice;

public class VechileTest {
    public static void main(String[] args) {
        Vechile v=new Car();
        v.id=8;
        v.number="AP1757";
        v.speed();
        System.out.println("*********************************************");

        Car c=new Car();
        c.id=9;
        c.number="AP8495";
        c.model="audia6";
        c.volkswogen();
        c.bmw();

        System.out.println("***********************************************");
        Bike b=new Bike();
        b.id=10;
        b.number="AP10001";
        b.ktm();
        b.royalenfield();


    }
}
