package Collections;

import java.util.*;

public class TestPerson {
    public static void main(String[] args) {
        Set<Person>as=new HashSet<>();
        Person s = new Person();
        s.id = 1;
        s.name = "King";
        Person s1 = new Person();
        s1.id = 2;
        s1.name = "queen";
        Person s2 = new Person();
        s2.id = 1;
        s2.name = "King";
        as.add(s);
        as.add(s1);
        as.add(s2);
        for (Person a : as) {
            System.out.println(a.id + " " + a.name);

        }
    }
}