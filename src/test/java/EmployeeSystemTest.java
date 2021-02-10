import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class EmployeeSystemTest {
    EmployeeSystem testObject;
    Employee testPersonal;

    @BeforeEach
    void initMethod() {
        testObject = new EmployeeSystem();
        testPersonal = new Employee("Adam", "Ballard", 26, 45000);
    }


    @Test
    @DisplayName("Yeeeey")
    void testForCreatingEmployeeSystem() {

    }

    @Test
    @DisplayName("Yeeeey")
    void addEmployeeToList() {
        testObject.addEmployeeToList(testPersonal);
    }
}


