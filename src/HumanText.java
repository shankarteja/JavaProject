import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HumanText {
    public static void main(String[] args) {

        Human h = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the gender");
        String gender = sc.next();
        if (gender.equalsIgnoreCase("male")) {
            h = new Male();
        } else {
            h = new Female();
        }  if ( gender.equalsIgnoreCase("trans")){
            h = new Transgender();
        }
        h.welcome();

    }

}


