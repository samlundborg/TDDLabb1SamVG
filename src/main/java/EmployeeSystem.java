import java.util.ArrayList;

public class EmployeeSystem {

    private ArrayList<Employee> EmployeeList = new ArrayList<>();

    public void addEmployeeToList(Employee employee) {
        EmployeeList.add(employee);
    }

    public Employee getEmployee(int employeeID) {
        for (int i = 0; i < EmployeeList.size(); i++) {
            if (EmployeeList.get(i).getID() == employeeID) {
                return EmployeeList.get(i);
            }
        }
        return null;
    }

    public void removeEmployeeFromList(int employeeID) {
        for (int i = 0; i < EmployeeList.size(); i++) {
            if (EmployeeList.get(i).getID() == employeeID) {
                EmployeeList.remove(i);
            }
        }
    }

    public void giveRaiseToEmployee(int employeeID, int percentRaise) {
        for (int i = 0; i < EmployeeList.size(); i++) {
            if (EmployeeList.get(i).getID() == employeeID) {
                EmployeeList.get(i).giveRaise(percentRaise);
            }
        }
    }
}
