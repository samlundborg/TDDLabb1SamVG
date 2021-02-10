public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private static int employeeID;

    public Employee(String firstName, String lastName, int age, int salary) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        employeeID += 1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return employeeID;
    }
}
