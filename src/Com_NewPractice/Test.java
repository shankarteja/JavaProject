package Com_NewPractice;

public class Test {

    public static void main(String[] args) {
		Bajaj a=new Bajaj();
		a.hero();
       a.pulsar();
       a.yamaha();
        System.out.println("***********************************");
       Showroom b=new Showroom();
       b.duke();
        b.honda();
       b.vespa();
        System.out.println("**************************************");
        Bajaj c=new Showroom();
        c.pulsar();

    }

}
