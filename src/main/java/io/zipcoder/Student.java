package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student>{

    private String firstName;

    private String lastName;

    private ArrayList<Double> examScores;

    @Override
    public int compareTo(Student o){
        return this.getAverageScore() - o.getAverageScore();
    }


    public Student(String firstName, String lastName, ArrayList<Double> examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getExamScore() {
        return examScores;
    }

    public void printExamScores(ArrayList<Double> examScores){
        for(int i = 0; i < examScores.size(); i++){
            System.out.println("Exam " + (i + 1)  + " -> " + examScores.get(i));
        }
    }

    public void addExamScore(double newScore){
        this.examScores.add((double)Math.round(newScore));
    }

    public void setExamScores(int examNumber, double examScore){
        for(int i = 0; i < this.examScores.size(); i++){
            if(i == 0){
                this.examScores.set(i, (double)Math.round( examScore));
            }
        }
    }

    public int getAverageScore(){
        double sum = 0.0;
        for(int i = 0; i < this.examScores.size(); i++){
            sum += this.examScores.get(i);
        }
        return (int)Math.round(sum / this.examScores.size());
    }

    public void printStudent(){
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.getAverageScore());
        for(int i = 0; i < examScores.size(); i++){
            System.out.println(this.examScores.get(i));
        }
    }
}
