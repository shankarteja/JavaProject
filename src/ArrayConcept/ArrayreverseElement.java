package ArrayConcept;

public class ArrayreverseElement {
    int arr[] = new int[4];
    int cursor = -1;

    public int add(int b) {
        cursor++;
        if (cursor <= arr.length - 1) {
            arr[cursor] = b;
        }
        return b;

    }

    public int removele() {
        if (cursor >= 0) {
            int e = arr[0];
            int axd[] = new int[arr.length];

            axd= copymethod(arr,cursor);


            cursor--;
        }
            return cursor;
        }

        public static int[] copymethod (int[] arr, int cursor){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i + 1];
            }
            return arr;
        }

        public static void main (String[]args){
            ArrayreverseElement are = new ArrayreverseElement();
            int x = are.add(10);
            int x1 = are.add(20);
            int x2 = are.add(30);
            int x4 = are.add(40);
            System.out.println(x + " " + x1 + " " + x2 + " " + x4);
        int e= are.removele();
//        int e1= are.removele();
//        int e2= are.removele();
            int e4 = are.removele();
//        System.out.println(e+" "+ e1+" "+e2+" "+e4 +" " );
            System.out.println(e);

        }

    }



