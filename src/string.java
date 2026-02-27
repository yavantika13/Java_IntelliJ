public class string {
    public static void main(String[] args) {
        String name = "Isha";
        String msg = "Hello World";
        System.out.println(name);
        System.out.println(msg);
        System.out.println(name.length());
        System.out.println(name.charAt(1));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(msg.substring(0,3));
        System.out.println(name.equals(msg));
        System.out.println(msg.equals("Hel"));
        System.out.println(msg.contains("Hel"));


        String name1 = "Isha";
        String reverse = "";
        for(int i=name1.length()-1;i>=0;i--){
            reverse += name1.charAt(i);
        }
        System.out.println("Reversed: "+reverse);


        String str  = "malayalam";
        int i=0,j=str.length()-1;
        while (i<j){
            if (str.charAt(i) !=str.charAt(j)){
                System.out.println("Not Palindrome");
                break;
            }
            else {
                i++;
                j--;
                System.out.println("Palindrome");

            }
        }
    }
}
