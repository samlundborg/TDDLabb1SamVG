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
    // If you want to test that a specific employee was added to ArrayList you need to use Dictionaries.


    @Test
    @DisplayName("Yeeeey")
    void removeEmployeeToList() {
        testObject.removeEmployeeToList(testPersonal.getID());
        assertNull(testObject.getEmployee(testPersonal.getID()));
    }



}


