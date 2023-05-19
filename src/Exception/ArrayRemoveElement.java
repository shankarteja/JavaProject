package Exception;

public class ArrayRemoveElement {
    public static int removeElement(int arr[],int element){
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=element){
                arr[index]=arr[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,11};

        int newIndex=removeElement(arr,3);
        for (int i = 0; i <newIndex ; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}





