package ArrayConcept;

public class ArraySize {

        public static void main(String[] args) {
            int arr [] = new int[2];
            int index=0;
            for(int i=0;i<10;i++){
//                if (index== arr.length) {
                if (arr[i] !=4){
                    arr=createAndCopyArr(arr,2);
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
        public static int[] createAndCopyArr(int[] arr, int z){
            int newArr [] = new int[arr.length + z];
            for (int i=0;i< arr.length;i++){
                newArr[i]=arr[i];
            }
            return newArr;
        }
    }










