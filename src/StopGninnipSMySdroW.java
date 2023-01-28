import java.util.Arrays;

public class StopGninnipSMySdroW {
    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                char[] a = words[i].toCharArray();
                char[] b = new char[a.length];
                for (int j = 0; j < a.length; j++)
                    b[j] = a[a.length - 1 - j];
                words[i] = String.valueOf(b);
            }
        }
        return String.join(" ",words);
    }

    public static void main(String... number) {

        System.out.println(spinWords("Hey fellow warriors"));
    }
}
