package classpart;

import java.sql.SQLOutput;

public class Student {

    int studentID;
    String studentName;
    String address;

    public Student(int id,String name){
        this.studentID = id;
        this.studentName = name;
    }
    public void showStudentInfo(){
        System.out.println("학생 ID : "+this.studentID);
        System.out.println("학생 이름 : "+this.studentName);
        System.out.println("학생 주소 : "+this.address);
    }

    public String getStudentName(){
        return this.studentName;
    }
}
