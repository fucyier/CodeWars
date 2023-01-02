import java.util.Arrays;

public class BoolToWord {
    public static String boolToWord(boolean b)
    {
       return  b==true?"Yes":"No";
    }
    public static void main(String... args) {

        System.out.println(Arrays.asList(boolToWord(true)));
    }
}
