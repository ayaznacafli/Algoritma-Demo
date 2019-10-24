package algorithim_file;

import java.util.Comparator;

public class StudentShortByRole implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getExam_points()-o2.getExam_points();
    }
}
