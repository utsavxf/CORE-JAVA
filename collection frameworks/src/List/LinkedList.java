package List;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> l1=new java.util.LinkedList<>();
        //Unlike in Linked List in C++ here we also have a method to insert or remove from a particular index
        l1.addFirst(12);
        l1.addFirst(21);
        l1.addLast(32);
        l1.add(1,34);
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
        l1.removeFirst();
        System.out.println(l1);
        //Iterating over the linked list
        for(int it:l1){
            System.out.println(it);
        }
    }
}
