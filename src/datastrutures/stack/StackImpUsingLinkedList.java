package datastrutures.stack;

public class StackImpUsingLinkedList {

    Node head;

    StackImpUsingLinkedList() {
        head = null;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackImpUsingLinkedList lls = new StackImpUsingLinkedList();
        //System.out.println(lls.pop()); //Stack is empty

        lls.push(10);
        lls.push(20);
        lls.push(30);
        lls.push(60);
        lls.push(90);

        System.out.println("Element popped from stack : " + lls.pop()); //Element popped from stack : 90
        System.out.println("Element popped from stack : " + lls.pop()); //Element popped from stack : 60

        lls.push(80);
        System.out.println("Element popped from stack : " + lls.pop()); //Element popped from stack : 80

        printList(lls.head);
        /**
         * 30
         * 20
         * 10 */

    }

    //push(): add value to the beginning of the list
    public void push(int value) {

        Node extraHead = head;
        head = new Node();
        head.value = value;
        head.next = extraHead;

    }

    public int pop() {
        if (head == null) {
            System.out.println("Stack is empty");
        }

        int value = head.value;
        head = head.next;
        return value;
    }

    class Node {
        int value;
        Node next;
    }
}
