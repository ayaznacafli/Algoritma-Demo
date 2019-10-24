package algorithim_file;

import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyConfig config = new MyConfig();

        List<Student> list = config.getStudents();
        Collections.sort(list,new StudentShortByRole());
        for (Student student:list) {
            System.out.println(student);
        }
    }
}


