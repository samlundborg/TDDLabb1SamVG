import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class EmployeeSystemTest {
    EmployeeSystem testObject;
    Employee testPersonal, testPersonal2, testPersonal3;

    @BeforeEach
    void initMethod() {
        testObject = new EmployeeSystem();
        testPersonal = new Employee("Vince", "Adler", 28, 55000);
        testPersonal2 = new Employee("Anton", "Danieli", 31, 55000);
        testPersonal3 = new Employee("Sammie", "Lundborg", 23, 55000);
    }

    @Test
    @DisplayName("Tests the method to add an employee")
    void testAddEmployeeToList() {
        testObject.addEmployeeToList(testPersonal);
        assertEquals(testPersonal, testObject.getEmployee(testPersonal.getID()));
    }

    @Test
    @DisplayName("Tests the method to remove an employee")
    void testRemoveEmployeeFromList() {
        testObject.addEmployeeToList(testPersonal);
        testObject.addEmployeeToList(testPersonal2);
        testObject.addEmployeeToList(testPersonal3);

        testObject.removeEmployeeFromList(testPersonal.getID());
        assertNull(testObject.getEmployee(testPersonal.getID()));
    }

    @Test
    @DisplayName("Tests the method to give specific employee a raise")
    void testGiveRaise() {
        testObject.addEmployeeToList(testPersonal);
        double test = testObject.getEmployee(testPersonal.getID()).getSalary();
        testObject.giveRaiseToEmployee(testPersonal.getID(),50);
        assertEquals(test * 1.5, testObject.getEmployee(testPersonal.getID()).getSalary());
    }

}
