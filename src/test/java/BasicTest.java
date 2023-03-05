import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class BasicTest {
    @DisplayName("Single test, named: 'test' successful")
    @Test
    public void test(){
        String s1 = "asd";
        Assertions.assertEquals("asd", s1);
    }

    @DisplayName("Actions test")
    @Test
    public void actionTest(){
        int a = 1;
        Assertions.assertEquals(1, a);
    }

}
