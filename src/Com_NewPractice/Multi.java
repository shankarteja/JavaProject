package Com_NewPractice;

public class Multi {
    public static int[] mulary(int arr[]){
        int newarr[]=new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            newarr[i]=arr[i]*2;
        }
        return newarr;
    }

    public static void main(String[] args) {
        int arr[]={7,8,9,10};
        int ouput[]=mulary(arr);
        for (int x:ouput){
            System.out.println(x);

        }
    }

}
