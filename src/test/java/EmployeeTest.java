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

    @Test
    @DisplayName("Test employee last name")
    void testGetLastName() {
        assertEquals("Adler", testObject.getLastName(), "Should result in 'Adler'");
    }

    @Test
    @DisplayName("Test employee set last name")
    void testSetLastName() {
        testObject.setLastName("Adde");
        assertEquals("Adde", testObject.getLastName(), "Should result in 'Adde'");
    }

    @Test
    @DisplayName("Test employee age")
    void testGetAge() {
        assertEquals(28, testObject.getAge(), "Should result in '28'");
    }

    @Test
    @DisplayName("Test set employee age")
    void testSetAge() {
        testObject.setAge(29);
        assertEquals(29, testObject.getAge(), "Should result in '29'");
    }
}
