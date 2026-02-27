public class count {
    public static void main(String[] args) {
        String word = "madam";
        int vowels = 0;
        int consonants = 0;

        word = word.toLowerCase(); // make case-insensitive

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // check only alphabets
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Word: " + word);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);


        String sen = "My name is Isha";
        String[] words = sen.trim().split("\\s+");
        System.out.println("Sentence: " + sen);
        System.out.println("Word count: " + words.length);
    }
}
