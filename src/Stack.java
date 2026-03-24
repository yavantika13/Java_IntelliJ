import java.util.*;
public class Stack {
    int arr[];
    int top;
    int size;
    Stack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }
    void push(int x){
        if(top == size - 1){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = x;
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return;
        }
//        arr[top--] = arr[top];
        System.out.println(arr[top--]);
    }
    void peak(){
        if(top == -1){
            System.out.println("Empty Stack");
        }
        System.out.println(arr[top]);
    }
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.peak();
        s.pop();
        s.peak();
    }
}
