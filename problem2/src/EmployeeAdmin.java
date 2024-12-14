import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {

    public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {

        if (socSecNums.isEmpty()||table.isEmpty()) {return null;}
        List<Employee> employees = new ArrayList<>();
        for (String socNum : socSecNums) {
            if (table.containsKey(socNum)) {
                if (table.get(socNum).getSalary() >80000) {
                    employees.add(table.get(socNum));
                }
            }
        }
        Collections.sort(employees,new SSNComparator());
        return employees;
    }


}
