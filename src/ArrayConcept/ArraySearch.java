package ArrayConcept;

public class ArraySearch {
    public static void main(String[] args) {
            int arr[] = {1,3,5,7,9,11};
            int number = 11;
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == number) {
                   found = true;
                    break;
                }
            }

            if (found) {

                System.out.println("number is  found");
            } else {
                System.out.println("number is not found");
            }

        }
    }





