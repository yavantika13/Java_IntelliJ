import java.util.*;
public class SUMQUEUE {
    static class qu {
        ArrayList<Integer> queue = new ArrayList<>();
        void add(int data) {
            queue.add(data);
        }
        void Window(int k) {
            if (queue.isEmpty() || k > queue.size()) {
                System.out.println("Invalid k");
                return;
            }
            // 👉 sirf k windows ke liye
            for (int i = 0; i <= queue.size() - k && i < k; i++) {
                int sum = 0;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                System.out.print("Window: ");
                for (int j = i; j < i + k; j++) {
                    int val = queue.get(j);
                    // print (no duplicate)
                    System.out.print(val + " ");
                    sum += val;
                    if (val > max) max = val;
                    if (val < min) min = val;
                }
                System.out.println("Sum = " + sum);
                System.out.println("Max = " + max);
                System.out.println("Min = " + min);
                System.out.println("-------------------");
            }
        }
        void display() {
            if (queue.isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }

            for (int i = 0; i < queue.size(); i++) {
                System.out.print(queue.get(i) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        qu q = new qu();
        q.add(4);
        q.add(-3);
        q.add(5);
        q.add(-1);
        q.add(9);
        q.add(-2);
        q.display();
        int k = 3;
        q.Window(k);
    }
}