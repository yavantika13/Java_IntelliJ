import java.util.*;
public class list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        int max = list.get(0);
        for(int num:list){
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
        int sum = 0;
        for(int num : list){
            sum += num;
        }
        System.out.println(sum);
        double avg = (double) sum/list.size();
        System.out.println(avg);
        int rev = 0;
        for(int i = list.size()-1;i>=0;i++){
            System.out.println(list.get(i));
        }
        int evencount = 0;
        int oddcount = 0;
        for (int j = 0;j<list.size();j++){
            if(list.get(j)%2==0){
                evencount++;
            }
            else {
                oddcount++;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
