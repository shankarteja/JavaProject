package Functionspractice;

public class Functionpractice4 {
    public static void main(String[] args) {
        printWihtoutLoop(1);
    }

    public static void printWihtoutLoop(int n){
        if(n <= 10){
            System.out.println(n);
            printWihtoutLoop( n+1 );
        }
    }
}