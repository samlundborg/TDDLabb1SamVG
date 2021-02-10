public class Employee {

    private String firstName;

    public Employee(String firstName, String lastName, int age, int salary) {

        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
