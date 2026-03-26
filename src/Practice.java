////import java.util.*;
////public class Practice {
////    public static void main(String[] args) {
////        Queue<Integer> queue = new LinkedList<>();
////        queue.add(1);
////        queue.add(2);
////        queue.add(3);
////        queue.add(2);
////        queue.add(1);
////
////        Stack<Integer> stack = new Stack<>();
////        for (int num : queue) {
////            stack.push(num);
////        }
////
////        boolean isPalindrome = true;
////        for (int num : queue) {
////            if (num != stack.pop()) {
////                isPalindrome = false;
////                break;
////            }
////        }
////        if (isPalindrome) {
////            System.out.println("Palindrome");
////        } else {
////            System.out.println("Not Palindrome");
////        }
////    }
////}
////
//
//
//import java.util.*;
//
//public class Practice {
//    public static void main(String[] args) {
//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(2);
//        queue.add(1);
//
//        Stack<Integer> stack = new Stack<>();
//
//        for (Integer num : queue) {
//            stack.push(num);
//        }
//
//        boolean isPalindrome = true;
//
//        for (Integer num : queue) {
//            if (!num.equals(stack.pop())) {
//                isPalindrome = false;
//                break;
//            }
//        }
//
//        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
//    }
//}