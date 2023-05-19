package java8features;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Integer, Integer> ml = (x) -> x * x;
        f1(ml);

    int r3= ml.apply(4);
        System.out.println(r3);
        int r4= ml.apply(3);
        System.out.println(r4);
    }
  static void f1(Function<Integer,Integer>fun){
        int r1= fun.apply(2);
        int r2= fun.apply(6);
         System.out.println(r1+" "+r2);
    }
}
