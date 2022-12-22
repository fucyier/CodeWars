public class SmashWords {
    public static String smash(String... words) {
        String a = "";
        for (int i = 0; i < words.length; i++) {
            a += " " + words[i];
        }
        return a.stripLeading();
    }

    public static void main(String... args) {
        String[] arrays = {"hello", "world", "this", "is", "great" };
        System.out.println(smash(arrays));
    }
}
