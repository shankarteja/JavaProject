package ArrayConcept;

public class ArrayOrder {
    int arr[] = new int[5];
    int cursor=-1;
    public  int add(int a) {
        cursor++;
        if (cursor <= arr.length-1) {
            arr[cursor] = a;
        }
            return a;
    }
        public  int arrremove() {

//        if (cursor >= 0) {
            int e = arr[cursor];
            cursor--;
//        }
            return e;
    }
    public static void main(String[] args) {
                ArrayOrder ao = new ArrayOrder();
                 int x=ao.add(10);
                 int  x1 = ao.add(20);
                int  x2= ao.add(30);
                int  x3=ao.add(40);
                int  x4=ao.add(50);
                System.out.println(x +" "+x1 +" "+x2+" "+x3+" "+x4);
                int e= ao.arrremove();
                int e1= ao.arrremove();
                int e2= ao.arrremove();
                int e4= ao.arrremove();
                System.out.println(e+" "+ e1+" "+e2+" "+e4 +" " );

            }
        }




