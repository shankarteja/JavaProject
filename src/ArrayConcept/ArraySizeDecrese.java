package ArrayConcept;

public class ArraySizeDecrese {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index!= arr.length - 1) {
                arr = decreasearray(arr, 4);

            }
            arr[index] = i;
            index++;
        }
        display(arr);

    }


    public static void display(int[] arr) {
        for (int x: arr) {
            System.out.println(x);
        }
    }

    private static int[] decreasearray(int[] arr, int y) {
        int newarr[]=new int[arr.length -y];
        int[] array = {1, 2, 3, 4, 5};
        int index = 2;
        return newarr;
    }
}
