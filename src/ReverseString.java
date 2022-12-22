import java.util.Arrays;

public class ReverseString {
    public static String solution(String str) {
        char[] chars = str.toCharArray();
        char[] charsNew = new char[str.length()];
        for (int i = str.length() - 1; i >= 0; i--)
            charsNew[str.length() - 1 - i] = chars[i];
        return String.valueOf(charsNew);
    }

    public static void main(String... args) {
        String word = "dfbdskbfsudbfdsbgflnasşv";
        System.out.println(solution(word));
    }
}
