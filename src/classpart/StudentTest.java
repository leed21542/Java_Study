package classpart;

import classpart.Student;

public class StudentTest {

    public static void main(String[] args){
        Student studentLee = new Student(1,"유상호");
        studentLee.address = "부산";

        studentLee.showStudentInfo();
        System.out.println(studentLee.getStudentName());
    }
}
