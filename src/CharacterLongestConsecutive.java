import java.util.*;

import static org.junit.Assert.assertArrayEquals;

public class CharacterLongestConsecutive {
    public static Object[] longestRepetition(String s) {
        if (s.length() == 0) return new Object[]{"", 0};
        char[] chars = s.toCharArray();
        int count;
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!stringIntegerMap.containsKey(String.valueOf(chars[i]))) {
                count = 0;
                for (int j = 0; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                    }
                }
                stringIntegerMap.put(String.valueOf(chars[i]),count);
            }
        }

        return new Object[]{
                Collections.max(stringIntegerMap.entrySet(), Map.Entry.comparingByValue()).getKey(),
                Collections.max(stringIntegerMap.values())
        };
    }

    public static void main(String... args) {
        String a = "aabb";
        System.out.println(Arrays.asList(longestRepetition(a)));
    }
}

