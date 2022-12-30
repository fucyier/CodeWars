public class StringsWithEnds {

    public static boolean stringWithEnds(String str, String ending) {

        if (str.length() < ending.length()) return false;

        boolean result = true;
        char[] endings = ending.toCharArray();
        char[] strs = str.toCharArray();
        int strslength = strs.length;

        for (int i = endings.length - 1; i > -1; i--) {
            if (endings[i] != strs[--strslength]) result = false;
        }
        return result;
    }

    public static void main(String... args) {

        System.out.println((stringWithEnds("fhvhvhu", "vhu")));
    }
}
