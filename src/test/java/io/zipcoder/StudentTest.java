package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void testStudentConstructor(){
        //Given
        ArrayList<Double> scores = new ArrayList<>(Arrays.asList(58.9, 96.5, 104.5));
        Student student = new Student("Tiger", "Woods", scores);


        //Then
        Assert.assertEquals("Tiger", student.getFirstName());
        Assert.assertEquals("Woods", student.getLastName());
        Assert.assertEquals(87.0,student.getAverageScore(),.02);

    }

    @Test
    public void getFirstName() {
        //Given
        Student student = new Student("Tiger", "Woods", null);

        //Then
        Assert.assertEquals("Tiger", student.getFirstName());

    }

    @Test
    public void setFirstName() {
        //Given
        Student student = new Student("Tiger", "Woods", null);
        student.setFirstName("Charlie");

        //Then
        Assert.assertEquals("Charlie", student.getFirstName());
    }

    @Test
    public void getLastName() {
        //Given
        Student student = new Student("Tiger", "Woods", null);

        //Then
        Assert.assertEquals("Woods", student.getLastName());


    }

    @Test
    public void setLastName() {
        //Given
        Student student = new Student("Tiger", "Woods", null);
        student.setLastName("Smith");

        //Then
        Assert.assertEquals("Smith", student.getLastName());
    }

    @Test
    public void addExamScore() {
        //Given
        Student student = new Student("Tiger", "Woods", new ArrayList<>());
        student.addExamScore(58.96);

        //Then
        Assert.assertEquals(new ArrayList<>(Arrays.asList(59.0)), student.getExamScore());
    }

    @Test
    public void getAverageScore() {
        //Given
        Student student = new Student("Tiger", "Woods", new ArrayList<>(Arrays.asList(34.8, 90.4, 99.9)));

        //Then
        Assert.assertEquals(75.03, student.getAverageScore(), 0.2);
    }

}