public class AreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        if (name.startsWith("r") || name.startsWith("R"))
            return name + " plays banjo";
        else return name + " does not play banjo";
    }

    public static void main(String... name) {
        String word = "dfbdskbfsudbfdsbgflnasşv";
        System.out.println(areYouPlayingBanjo(word));
    }
}
