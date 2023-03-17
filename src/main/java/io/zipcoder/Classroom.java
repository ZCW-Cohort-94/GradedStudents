package io.zipcoder;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Classroom {

    Student student = new Student(null, null, null);

    private Student[] students;

    private TreeMap<String, Student[]> gradebook = new TreeMap<>();

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
        Arrays.sort(students, Collections.reverseOrder());
        return students;
    }

    public TreeMap getGradebook(Student... s){
        if(student.getAverageScore() > (0.90 * getClassAverage())){
            gradebook.put("A", s);
        } else if(student.getAverageScore() < (0.90 * getClassAverage()) && student.getAverageScore() > (0.70 * getClassAverage())){
            gradebook.put("B", s);
        } else if(student.getAverageScore() < (0.70 * getClassAverage()) && student.getAverageScore() > (0.50 * getClassAverage())){
            gradebook.put("C", s);
        } else if(student.getAverageScore() < (0.50 * getClassAverage()) && student.getAverageScore() > 0.10 * getClassAverage()){
            gradebook.put("D", s);
        } else if(student.getAverageScore() < (0.10 * getClassAverage())){
            gradebook.put("F", s);
        }
        return gradebook;
    }
}
