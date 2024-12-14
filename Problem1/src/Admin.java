import java.util.*;

public class Admin {

    private static HashMap<Key, Student> StudentStatus = new HashMap<>();

    public static HashMap<Key, Student> processStudents(List<Student> students) {
        if (students.isEmpty()) {
            return null;
        }
        for (Student s : students) {

            Key obj=new Key(s.getFirstName(), s.getLastName());

            StudentStatus.put(obj, s);
        }

        return StudentStatus;
    }
}
