import java.util.*;
public class ListNode {
    Node head;
  int  val;

     ListNode next;

    class Node {
    int val;
    Node next;
       // int data;
   // ListNode next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

    // Insert at end
    void insert(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        } else {
            ListNode.Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void display(){
        ListNode.Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -->  ");
            temp=temp.next;
        }
        System.out.println("null");
    }
   Node NewList (Node head, int x){
    Node smallerHead = new Node(0);
    Node greaterHead = new Node(0);
    Node smaller = smallerHead;
    Node greater = greaterHead;
    while (head != null){
        if(head.val < x){
            smaller.next = head;
            smaller = smaller.next;;
        }
        else {
            greater.next = head;
            greater = greater.next;
        }
        head = head.next;
    }
    greater.next = null;
    smaller.next = greaterHead.next;
    return smallerHead.next;
}

    public static void main(String[] args) {
        ListNode list=new ListNode();
        list.insert(13);
        list.insert(5);
        list.insert(7);
        list.insert(2);
        list.insert(11);
        list.insert(15);
        System.out.println("Original List:");
        list.display();
        list.head = list.NewList(list.head, 10);
        System.out.println("New List:");
        list.display();
    }
}
