package algorithim_file;

import java.util.Comparator;
import java.util.Date;

//"Student name","Exam name","Exam date","Exam points"
public class Student{
   private String student_name;
   private String exam_name;
   private Date exam_date;
   private int exam_points;


    public Student(String student_name, String exam_name, Date exam_date, int exam_points) {
        this.student_name = student_name;
        this.exam_name = exam_name;
        this.exam_date = exam_date;
        this.exam_points = exam_points;
    }
    public Student() {
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }

    public Date getExam_date() {
        return exam_date;
    }

    public void setExam_date(Date exam_date) {
        this.exam_date = exam_date;
    }

    public int getExam_points() {
        return exam_points;
    }

    public void setExam_points(int exam_points) {
        this.exam_points = exam_points;
    }



    @Override
    public String toString() {
        return "Student{" +
                "student_name='" + student_name + '\'' +
                ", exam_name='" + exam_name + '\'' +
                ", exam_date='" + exam_date + '\'' +
                ", exam_points=" + exam_points +
                '}';
    }
}
