package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Classroom {

    Student student = new Student(null, null, null);

    private Student[] students;

    public Classroom(){
        students = new Student[30];
    }

    public Classroom(int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students){
        this.students = students;
    }


    public String getStudents(){
        return students.toString();
    }

    public Double getClassAverage(){
        double sum = 0.0;
        for(int i = 0; i < students.length; i++){
            sum += student.getAverageScore();
        }
        return sum / students.length;
    }

    public void addStudent(Student student){
        for(int i = 0; i <students.length; i++){
                if(students[i] == null){
                students[i] = student;
            }
        }
    }

    public void removeStudent(String firstName, String lastName){
        for(int i = 0; i < students.length; i++){
            if(students[i].equals( student.getFirstName().equals(firstName) && student.getLastName().equals(lastName))){
                students[i] = null;
            }
        }
    }

    public  Student[] getStudentsByScore(){
        Arrays.sort(students);
        return students;
    }

}
