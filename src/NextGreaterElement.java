import java.util.*;
import java.util.Stack;
public class NextGreaterElement {
        static void NextGreater(int[] arr1) {
            Stack<Integer> stack = new Stack<>();
            for(int i=arr1.length-1;i>=0;i--){
                while (!stack.isEmpty() && stack.peek()<=arr1[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    System.out.println("-1"+" ");
                }else {
                    System.out.println(stack.peek()+" ");
                }
                stack.push(arr1[i]);
            }
        }
        public static void main(String[] args) {
            int[] arr1={1,1,2,3,4};
            NextGreater(arr1);
        }
    }

