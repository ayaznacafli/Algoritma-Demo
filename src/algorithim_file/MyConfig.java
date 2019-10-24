package algorithim_file;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyConfig {


    public List<Student> getStudents(){
        File studentFile = new File("C:/Users/gasan/Desktop/student.txt");
        List<Student> linkedList = new LinkedList<>();
        try {
            BufferedReader getInfo = new BufferedReader(new FileReader(studentFile));
            String studentInfo = getInfo.readLine();
            while (studentInfo!=null){
                String[] list = studentInfo.split(",");
                String student_name=list[0].substring(1,list[0].length()-1);
                String exam_name=list[1].substring(1,list[1].length()-1);
                String exam_date=list[2].substring(1,list[2].length()-1);
                String exam_points= list[3].substring(1,list[3].length()-1);
                if(!exam_points.equals("Exam points")){
                    Student student = new Student();
                    student.setStudent_name(student_name);
                    student.setExam_name(exam_name);
                    student.setExam_date(new Date());
                    student.setExam_points(Integer.parseInt(exam_points));
                   linkedList.add(student);
                }
                studentInfo = getInfo.readLine();
            }
        }catch (FileNotFoundException nfe){
            System.out.println("file not found!");
        }catch (IOException e){
            System.out.println("Io Error");
        }
        return linkedList;
    }

}
