import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee testObject;
    Employee testObjectSam;

    @BeforeEach
    void initMethod() {
        testObject = new Employee("Vincent", "Adler", 28,55000);
    }

    @Test
    @DisplayName("Tests employee first name")
    void testGetFirstName() {
        assertEquals("Vincent", testObject.getFirstName(), "Should result in 'Vincent'");
    }

    @Test
    @DisplayName("Tests employee set first name")
    void testSetFirstName() {
        testObject.setFirstName("Vince");
        System.out.println(testObject.getID());
        assertEquals("Vince", testObject.getFirstName(), "Should result in 'Vince'");
    }

    @Test
    @DisplayName("Tests employee last name")
    void testGetLastName() {
        assertEquals("Adler", testObject.getLastName(), "Should result in 'Adler'");
    }

    @Test
    @DisplayName("Tests employee set last name")
    void testSetLastName() {
        testObject.setLastName("Adde");
        assertEquals("Adde", testObject.getLastName(), "Should result in 'Adde'");
    }

    @Test
    @DisplayName("Tests employee age")
    void testGetAge() {
        assertEquals(28, testObject.getAge(), "Should result in '28'");
    }

    @Test
    @DisplayName("Tests set employee age")
    void testSetAge() {
        testObject.setAge(29);
        assertEquals(29, testObject.getAge(), "Should result in '29'");
    }

    @Test
    @DisplayName("Tests employee ID")
    void testEmployeeID() {
        assertTrue(Integer.class.isInstance(testObject.getID())); // Integer klassen besitter metoden isInstance().
    }

    @RepeatedTest(10)
    @DisplayName("Tests unique employee ID")
    void testUniqueEmployeeID() {
        testObjectSam = new Employee("Samuela", "Lundborg", 23, 65000);
        assertNotEquals(testObject.getID(), testObjectSam.getID());
    }

    @Test
    @DisplayName("Tests employee get salary")
    void testGetSalary() {
        assertEquals(55000, testObject.getSalary(), "Should result in '55000'");
    }

    @Test
    @DisplayName("Tests employee set salary")
    void testSetSalary() {
        testObject.setSalary(60000);
        assertEquals(60000, testObject.getSalary(), "Should result in '60000'");
    }

    @Test
    @DisplayName("Tests that the constructor set the values")
    void testConstructor(){
        testGetSalary();
        testGetAge();
        testGetFirstName();
        testGetLastName();
    }

    @Test
    @DisplayName("Tests giving raise to Employee")
    void testGiveRaise() {
        double test = testObject.getSalary();
        testObject.giveRaise(50); //Raise for 50%
        assertEquals(test * 1.5,testObject.getSalary(),"The salary should change to 82500");
    }

    @Test
    @DisplayName("Tests giving a wrongly raise to Employee")
    void testGiveWrongRaise() {
        double test = testObject.getSalary();
        testObject.giveRaise(-50);
        assertEquals(test,testObject.getSalary(), "Nothing should change with the salary.");
    }

    @Test
    @DisplayName("Tests the ToString()")
    void testToString(){
        assertEquals("Employee{firstName='Vincent', lastName='Adler', age= 28, salary= 55000.0, employeeRealID= " + testObject.getID() + "}",testObject.toString());
    }

}