package ArrayConcept;

public class Addition {
    public static int[] addition(int arr[]){
        int newarr[]=new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            newarr[i]=arr[i]-2;
        }
        return newarr;
    }

    public static void main(String[] args) {
        int arr[]={7,8,9,10};
        int output[]=addition(arr);
        for (int x:output){
            System.out.println(x);
        }
    }
}
