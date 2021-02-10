import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee testObject;
    //TODO Change to constructor-chaining with standard values(?)

    @BeforeEach
    void initMethod() {
        testObject = new Employee("Vincent", "Adler", 28,55000);
    }

    @Test
    @DisplayName("Test employee")
    void testFirstName() {
        assertEquals("Vincent", testObject.getFirstName(), "Should result in 'Vincent'");
    }

}
