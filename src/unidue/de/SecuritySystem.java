package unidue.de;
import java.util.Map;
import java.util.HashMap;

public class SecuritySystem {
    private Map<Integer, EmployeeID> employees;

    SecuritySystem() {
        this.employees = new HashMap<>();
    }

    public void addEmployee(EmployeeID employee){
        employees.put(employee.getUid(),employee);
        System.out.println(employee.getVorname() + " "+ employee.getNachname()+ " added to the system.");
    }

    public void removeEmployee(EmployeeID employee){
        employees.remove(employee.getUid());
        System.out.println("Employee with name " + employee.getVorname() + " " + employee.getNachname() +" has been removed." );
    }

    public boolean isEmployed(EmployeeID employee){
        return employees.containsKey(employee.getUid());
    }

    public EmployeeID getEmployeeByUid(int uid){
        if (employees.containsKey(uid))
            return employees.get(uid);
        else {
            System.out.println("No employee with this UID");
            return new EmployeeID();

        }
    }


}
