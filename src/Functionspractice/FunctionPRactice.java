package Functionspractice;

public class FunctionPRactice {
    public static void main(String args[]){
        boolean r = isEven(4);
        System.out.println(r);
    }

    public static boolean isEven(int x){
        boolean result = x%2 == 0;
        return result;
    }
}

