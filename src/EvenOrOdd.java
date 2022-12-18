public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String... number) {
        System.out.println(even_or_odd(5));
    }
}
