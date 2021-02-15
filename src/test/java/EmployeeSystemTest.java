import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

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

    @ParameterizedTest
    @DisplayName("Tests the method to give specific employee a raise")
    @ValueSource ( doubles = {40, 50, 60, 122, -45})
    void testGiveRaise(double input) {
        testObject.addEmployeeToList(testPersonal);
        testObject.addEmployeeToList(testPersonal2);
        double testRaise = (input / 100) + 1;
        double test = testObject.getEmployee(testPersonal.getID()).getSalary() * testRaise;
        testObject.giveRaiseToEmployee(testPersonal.getID(),input);
        if (input > 0 && input <= 100) {
            assertEquals(test, testObject.getEmployee(testPersonal.getID()).getSalary());
            assertEquals(55000,testObject.getEmployee(testPersonal2.getID()).getSalary());
        } else {
            assertNotEquals(test, testObject.getEmployee(testPersonal.getID()).getSalary());
            assertEquals(55000,testObject.getEmployee(testPersonal2.getID()).getSalary());
        }
    }

    @ParameterizedTest
    @DisplayName("Tests the method to give all employees a raise")
    @ValueSource ( doubles = {40, 50, 60, 122, -45})
    void testGiveAllRaise(double input) {
        testObject.addEmployeeToList(testPersonal);
        testObject.addEmployeeToList(testPersonal2);
        testObject.giveRaiseToAllEmployees(input);
        testObject.addEmployeeToList(testPersonal3);
        double test = (input / 100) + 1;
        double testSalary = 55000 * test;

        if (input > 0 && input <= 100) {
            assertAll(
                    () -> assertEquals(testSalary,testObject.getEmployee(testPersonal.getID()).getSalary()),
                    () -> assertEquals(testSalary,testObject.getEmployee(testPersonal2.getID()).getSalary()),
                    () -> assertEquals(55000, testObject.getEmployee(testPersonal3.getID()).getSalary())
            );
        } else {
            assertAll(
                    () -> assertNotEquals(testSalary,testObject.getEmployee(testPersonal.getID()).getSalary()),
                    () -> assertNotEquals(testSalary,testObject.getEmployee(testPersonal2.getID()).getSalary()),
                    () -> assertEquals(55000, testObject.getEmployee(testPersonal3.getID()).getSalary())
            );
        }
    }

}
