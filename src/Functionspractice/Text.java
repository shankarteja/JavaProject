package Functionspractice;

import Functionspractice.Product;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        String str = sc.next();
        int age = 0;
        age = Integer.parseInt(str);
        System.out.println("age:" + age);
    }

    public static class CallByReferenceEx {

        public static void main(String[] args) {
            Product pro = new Product();
            pro.id = 12;
            pro.name = "Apple";
            pro.price = 3.4f;
            printProduct(pro);
            changeProductValues(pro);
            printProduct(pro);
            makeProductNull(pro);
            printProduct(pro);
        }

        private static void printProduct(Product pro) {
            System.out.println(pro.id + " " + pro.name + " " + pro.price);
        }

        private static void changeProductValues(Product pro) {
            pro.id = 14;
            pro.price = 3000.50f;
        }

        private static void makeProductNull(Product pro) {
            pro = null;
        }
    }
}
