//import java.util.*;
import java.util.ArrayList;
//import  java.util.Queue;
import java.util.Stack;
public class Queue {
    static class qu {
        ArrayList<Integer> queue = new ArrayList<>();
        void add(int data) {
            queue.add(data);
        }
        int remove() {
            if (queue.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return queue.remove(0);
        }
        int peek() {
            if (queue.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return queue.get(0);
        }

        boolean isEmpty() {
            return queue.size() == 0;
        }

        int size() {
            return queue.size();
        }
        // reverse
        void reverse(int k) {
            if (queue.isEmpty() || k > queue.size()) {
                System.out.println("Invalid k");
                return;
            }
            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < k; i++) {
                st.push(queue.remove(0));
            }
            while (!st.isEmpty()) {
                queue.add(st.pop());
            }

            int size = queue.size() - k;
            for (int i = 0; i < size; i++) {
                queue.add(queue.remove(0));
            }
        }
            void reverseAlternate(int m){
                if(queue.isEmpty() || m <= 0){
                    return;
                }
                ArrayList<Integer> result = new ArrayList<>();
                boolean reverse = true;
                for(int i = 0; i < queue.size(); i += m){
                    int end = Math.min(i + m, queue.size());
                    if(reverse){
                        for(int j = end - 1; j >= i; j--){
                            result.add(queue.get(j));
                        }
                    } else {
                        for(int j = i; j < end; j++){
                            result.add(queue.get(j));
                        }
                    }
                    reverse = !reverse; // toggle
                }
                queue = result;
            }

        void display() {
            if (queue.isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            for(int i = 0; i < queue.size(); i++){
                System.out.print(queue.get(i) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        qu q = new qu();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.display();
        int k =2;
//        q.reverse(k);
//        q.display();
        q.reverseAlternate(k);
        q.display();
    }
}