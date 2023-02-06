
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Reverse;


public class JUnitTest {
    @Test
    public void testDoubleLetter(){
        String input = "ok";
        String expected = "ok";

        String result = Reverse.transformString(input);

        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testingReverses(){
        String input = "cucumber";
        String expected = "r5bm21c21c";

        String result = Reverse.transformString(input);

        Assertions.assertEquals(expected, result);
    }
}
