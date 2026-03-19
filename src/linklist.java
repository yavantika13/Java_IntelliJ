public class linklist {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
// Insert at end
void insert(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
    } else {
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
}
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -->  ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void printMatching(Node l1, Node l2){
        while(l1 != null && l2 != null){
            if(l1.data == l2.data){
                System.out.print(l1.data + " ");
                break;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
    }

    public static void main(String[] args) {
        linklist list=new linklist();
        list.insert(3);
        list.insert(5);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        //list.display();
        linklist list1=new linklist();
        list1.insert(10);
        list1.insert(3);
        list1.insert(7);
        list1.insert(8);
        list1.insert(9);
      //  list1.display();
//        System.out.println( list.findMiddle(list.head));
        System.out.println("List 1:");
        list.display();
        System.out.println("List 2:");
        list1.display();

        System.out.println("Matching values:");
       list.printMatching(list.head, list1.head);

    }
}
