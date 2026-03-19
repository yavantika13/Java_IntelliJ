//import java.util.*;
//public class linkedlist {
//    Node head;
//    class Node {
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//    // Add New Element from begining
//    void insert(int data){
//        Node newnode = new Node(data);
//        newnode.next = head;
//        head = newnode;
//    }
//    // Add New Element From End
//    void insertend(int data){
//        Node newnode = new Node(data);
//        if(head == null){
//            head = newnode;
//            return;
//        }
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = newnode;
//    }
////    void display(){
////    Node temp = head;
////        while (temp != null){
////        System.out.print(temp.data + " -> ");
////        temp = temp.next;
////    }
////        System.out.println("null");
////}
//void delte()
//{
//    if(head == null){
//        return;
//    }
//    head = head.next;
//}
//void deleteend()
//{
//    while (head == null || head.next == null){
//        head = null;
//        return;
//    }
//    Node temp = head;
//    while (temp.next.next != null){
//        temp = temp.next.next;
//    }
//    temp.next = null;
//}
//void reverse(){
//
//}
//    void display(){
//        Node temp = head;
//        while (temp != null){
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//public static void main(String[] args) {
//        linkedlist l = new linkedlist();
//        l.insert(10);
//        l.insert(20);
//        l.insert(30);
//        l.insert(40);
//        l.display();
//        l.delte();
//        l.display();
//        l.deleteend();
//        l.display();
//    }
//}

public class linkedlist {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //ADD INSERT BEGGNING
    void insert(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }
    // add AT END
    void insertend(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newnode;

    }
    // delete at end
    void deleteend(){
        while(head==null || head.next==null) {

            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            System.out.println(temp.next.data);
            temp=temp.next.next;

        }


        temp.next=null;
    }
    // to display
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -->  ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        list.insertend(40);
        list.display();
        list.deleteend();
        list.display();
    }

}