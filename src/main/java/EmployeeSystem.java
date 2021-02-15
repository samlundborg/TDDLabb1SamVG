import java.util.ArrayList;

public class EmployeeSystem {

    private ArrayList<Employee> EmployeeList = new ArrayList<>();

    public void addEmployeeToList(Employee employee) {
        EmployeeList.add(employee);
    }

    public Employee getEmployee(int employeeID) {
        for (Employee employee : EmployeeList) {
            if (employee.getID() == employeeID) {
                return employee;
            }
        }
        return null;
    }

    public void removeEmployeeFromList(int employeeID) {
        EmployeeList.removeIf(employee -> employee.getID() == employeeID);
    }

    public void giveRaiseToEmployee(int employeeID, double percentRaise) {
        for (Employee employee : EmployeeList) {
            if (employee.getID() == employeeID) {
                employee.giveRaise(percentRaise);
            }
        }
    }

    public void giveRaiseToAllEmployees(double percentRaise) {
        for (Employee employee : EmployeeList) {
            employee.giveRaise(percentRaise);
        }
    }

}
