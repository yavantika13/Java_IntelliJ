import java.util.*;
public class swap {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(20);
//        int temp = list.get(0);
//        list.set(0,list.get(1));
//        list.set(1, temp);
//        System.out.println(list);
//        ArrayList<Integer> list2 = new ArrayList<>(list);
//        System.out.println(list2);
//
//        ArrayList<Integer> list3 = new ArrayList<>();
//        list3.add(100);
//        list3.add(200);
//        list3.add(300);
//        list3.addAll(list2);
//        list3.addAll(list);
//        System.out.println(list3);
//
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i).equals(list.get(j))) {
//                    list.remove(j);
//                }
//            }
//        }
//        System.out.println(list);
//        HashSet<Integer> set = new HashSet<>(list3);
//        System.out.println(set);
//
//        int frequencycount = 10;
//        int count = 0;
//        for(int num : list3){
//            if(num==frequencycount){
//                count++;
//            }
//        }
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(10);
        row1.add(20);
        row1.add(30);
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(40);
        row2.add(50);
        row2.add(60);
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(70);
        row3.add(80);
        row3.add(90);
        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);
        System.out.println(matrix);
        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>();
        ArrayList<Integer> row4 = new ArrayList<>();
        row4.add(10);
        row4.add(20);
        row4.add(30);
        ArrayList<Integer> row5 = new ArrayList<>();
        row5.add(40);
        row5.add(50);
        row5.add(60);
        ArrayList<Integer> row6 = new ArrayList<>();
        row6.add(70);
        row6.add(80);
        row6.add(90);
        matrix2.add(row4);
        matrix2.add(row5);
        matrix2.add(row6);
        System.out.println(matrix2);

    }
}
