package Functionspractice;

import java.util.Scanner;

public class ReverseNumber {

    @SuppressWarnings("resource")
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int reversedNumber = reverse(n);
            System.out.println(reversedNumber);
        }

        private static int reverse(int n) {
            int reverse = 0;
            while (n > 0) {
                int lastDigit = n % 10;
                reverse = reverse * 10 + lastDigit;
                n = n / 10;
            }
            return reverse;
        }
    }


