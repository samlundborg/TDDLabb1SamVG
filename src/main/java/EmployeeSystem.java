import java.util.ArrayList;

public class EmployeeSystem {

    ArrayList<Employee> EmployeeList = new ArrayList<>();


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

    public void removeEmployeeToList(int employeeID) {
        for (Employee employee : EmployeeList) {
            if (employee.getID() == employeeID) {
                EmployeeList.remove(employeeID);
            }
        }
    }

    }

