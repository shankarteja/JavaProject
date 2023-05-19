package Collections;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> as = new ArrayList<>();
        Student s = new Student();
        s.id = 1;
        s.name = "King";
        Student s1 = new Student();
        s1.id = 2;
        s1.name = "queen";
        Student s2 = new Student();
        s2.id = 1;
        s2.name = "King";
        as.add(s);
        as.add(s1);
        as.add(s2);
//        System.out.println(s.id+" "+s.name+" "+s1.id+" "+s1.name+" "+s2.id+" "+s2.name);

        for (Student a : as) {
            System.out.println(a.id + " " + a.name);


        }
    }
}