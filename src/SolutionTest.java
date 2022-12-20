import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD by writing your own tests

public class SolutionTest {
    @Test
    public void exampleTests() {
        assertArrayEquals(new Object[]{"a", 4}, CharacterLongestConsecutive.longestRepetition("aaaabb"));
        assertArrayEquals(new Object[]{"a", 7}, CharacterLongestConsecutive.longestRepetition("bbbaaabaaaa"));
        assertArrayEquals(new Object[]{"u", 3}, CharacterLongestConsecutive.longestRepetition("cbdeuuu900"));
        assertArrayEquals(new Object[]{"b", 5}, CharacterLongestConsecutive.longestRepetition("abbbbb"));
        assertArrayEquals(new Object[]{"a", 2}, CharacterLongestConsecutive.longestRepetition("aabb"));
        assertArrayEquals(new Object[]{"", 0}, CharacterLongestConsecutive.longestRepetition(""));
    }
}
