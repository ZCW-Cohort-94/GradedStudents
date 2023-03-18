package io.zipcoder;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Classroom {

    Student student = new Student(null,null,null);

    private Student[] students;

    private TreeMap<String, ArrayList<Student>> gradebook = new TreeMap<>();

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
        String result = new String();
        StringBuilder build = new StringBuilder();

        for(int i = 0; i < students.length; i++){
            build.append(students[i].getFirstName() + " " + students[i].getLastName() + " " + students[i].getAverageScore() + "\n");
            result = build.toString();
        }
        return result;
    }

    public Double getClassAverage(){
        double sum = 0.0;
        for(int i = 0; i < students.length; i++){
            sum += students[i].getAverageScore();
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

    public boolean removeStudent(String firstName, String lastName){
        int count = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].equals( students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName))){
                students[i] = null;
                count++;
            }

            }
        if(students[count].equals(null)){
    } return true;
    }


    public  Student[] getStudentsByScore(){
        Arrays.sort(students, Collections.reverseOrder());
        return students;
    }

    public TreeMap getGradebook() {
        gradebook.put("A", new ArrayList<>());
        gradebook.put("B", new ArrayList<>());
        gradebook.put("C", new ArrayList<>());
        gradebook.put("D", new ArrayList<>());
        gradebook.put("F", new ArrayList<>());

        for (int i = 0; i < students.length; i++) {
            if (students[i].getAverageScore() > (0.90 * getClassAverage())) {
                gradebook.get("A").add(students[i]);
            } else if (students[i].getAverageScore() < (0.90 * getClassAverage()) && students[i].getAverageScore() > (0.70 * getClassAverage())) {
                gradebook.get("B").add(students[i]);
            } else if (students[i].getAverageScore() < (0.70 * getClassAverage()) && students[i].getAverageScore() > (0.50 * getClassAverage())) {
                gradebook.get("C").add(students[i]);
            } else if (students[i].getAverageScore() < (0.50 * getClassAverage()) && students[i].getAverageScore() > 0.10 * getClassAverage()) {
                gradebook.get("D").add(students[i]);
            } else if (students[i].getAverageScore() < (0.10 * getClassAverage())) {
                gradebook.get("F").add(students[i]);
            }
        }
        return gradebook;
    }




}
