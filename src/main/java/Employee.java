public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private static int employeeID;
    private final int employeeRealID;

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        employeeID += 1;
        employeeRealID = employeeID;
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
        return employeeRealID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void giveRaise(double percentRaise) {
        if (percentRaise > 0 && percentRaise <= 100) {
            double x = percentRaise/100;
            salary = salary * (1+x);
        }
        else {
            System.out.println("Raise must be between 0-100%");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age= " + age +
                ", salary= " + salary +
                ", employeeRealID= " + employeeRealID +
                '}';
    }
}
