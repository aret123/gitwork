import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test001 {

    @DisplayName("Test")
    @Test
    void testGet() {
        assertEquals("Hello JUnit 5", "sss");
    }

    @DisplayName("Test2")
    @Test
    void test2() {
        assertEquals("Hello JUnit 5", "www");
    }


}
