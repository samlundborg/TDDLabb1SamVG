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
    @DisplayName("Test employee first name")
    void testGetFirstName() {
        assertEquals("Vincent", testObject.getFirstName(), "Should result in 'Vincent'");
    }

    @Test
    @DisplayName("Test employee set first name")
    void testSetFirstName() {
        testObject.setFirstName("Vince");
        assertEquals("Vince", testObject.getFirstName(), "Should result in 'Vince'");
    }
}
