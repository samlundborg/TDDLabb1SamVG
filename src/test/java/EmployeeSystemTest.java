import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class EmployeeSystemTest {
    EmployeeSystem testObject;
    Employee testPersonal;

    @BeforeEach
    void initMethod() {
        testObject = new EmployeeSystem();
        testPersonal = new Employee("Vince", "Adler", 28, 55000);
    }


    @Test
    @DisplayName("Yeeeey")
    void testForCreatingEmployeeSystem() {

    }

    @Test
    @DisplayName("Yeeeey")
    void addEmployeeToList() {
        testObject.addEmployeeToList(testPersonal);
        assertEquals(testPersonal, testObject.getEmployee(1));
    }
    //TODO Create a test to check that a specific employee was added to the list.


    @Test
    @DisplayName("Yeeeey")
    void removeEmployeeToList() {
        testObject.removeEmployeeToList(testPersonal);
        assertEquals(null, testObject.getEmployee(1));
    }

}


