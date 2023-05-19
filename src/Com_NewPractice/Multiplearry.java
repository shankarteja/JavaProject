package Com_NewPractice;

public class Multiplearry {

        public static boolean isDummyArray(int[] array){
            for(int i = 0;i<  array.length;i++){
                if(array[i] !=0){
                    return false;
                }
            }
            return true;
        }
        public static int countNonzeros(int[]array){
            int count = 0;
            for(int i = 0;i<  array.length;i++){
                if(array[i] !=0){
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args) {
            int arr[] = {0,0,4,0,2,7};
            int i = countNonzeros(arr);
           System.out.println(i);
           boolean b=isDummyArray(arr);
            System.out.println(b);
        }
    }


