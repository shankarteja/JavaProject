public class Human {
    String name;
    void welcome(){
        System.out.println("welcome to the world");
    }

}
class Male extends Human{
    void welcome(){
        System.out.println("welcome Mr: KING");
    }
}
class Female extends Human{
    void welcome(){
        System.out.println("welcome miss: Princess");
    }
}
class Transgender extends Human{
    void welcome(){
        System.out.println("welcome Mr/miss:Trans People");
    }
}
