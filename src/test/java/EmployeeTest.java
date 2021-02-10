import org.junit.jupiter.api.*;
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
        Assertions.assertEquals("Vincent", testObject.getFirstName());
    }

}
