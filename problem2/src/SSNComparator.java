import java.util.Comparator;
public class SSNComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        String SSN1 = o1.getSsn();
        String SSN2 = o2.getSsn();
        if (SSN1 == null && SSN2 == null) return 0;
        if (SSN1 == null) return -1;
        if (SSN2 == null) return 1;

        return SSN1.compareTo(SSN2);
    }
}