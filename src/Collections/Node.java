package Collections;

public class Node {
    int data;
    Node nextNode;
}
class Mylist {

    Node head, temp;
    public  int add(int a) {
        Node b = new Node();
        b.data = a;
        if(head == null) {
            head = b;
            temp = b;

        } else {
            temp.nextNode = b;
            temp = b;
        }
        return a;
    }
    public void display() {
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.nextNode;
    }
}
        public static void main(String[] args) {
        Mylist ml = new Mylist();
        ml.add(10);
        ml.add(20);
        ml.add(30);
        ml.add(40);
        ml.display();

    }
}


