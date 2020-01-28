package com.lambton;

import java.time.LocalDate;

enum Gender
{
    MALE,
    FEMALE,
    OTHER
}

public class Student {

    int studentId;
    String firstName;
    String lastName;
    LocalDate birthDate;
    Gender gender;
    int ageInYear;
    float subjectMarks1;
    float subjectMarks2;
    float subjectMarks3;
    float subjectMarks4;
    float subjectMarks5;
    float percentage;
    String result;


    float totalMarks;

    public Student(int studentId, String firstName, String lastName, LocalDate birthDate, Gender gender) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.ageInYear = calculateStudentAge();
        this.gender = gender;
    }


    public int getStudentId()
    {
        return  this.studentId;
    }

    public  void printData()
    {
        System.out.println("Student Id: " +studentId);
        System.out.println("Student FirstName: " +firstName);
        System.out.println("Student LastName: " +lastName);
        System.out.println("Student BirthDate: " +birthDate);
        System.out.println("Student Gender: " +gender);
        System.out.println("Age: " +ageInYear );
        System.out.println("Student TotalMarks: " +totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result );
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public float getSubjectMarks1() {
        return subjectMarks1;
    }

    public void setSubjectMarks1(float subjectMarks1) {
        this.subjectMarks1 = subjectMarks1;
    }

    public float getSubjectMarks2() {
        return subjectMarks2;
    }

    public void setSubjectMarks2(float subjectMarks2) {
        this.subjectMarks2 = subjectMarks2;
    }

    public float getSubjectMarks3() {
        return subjectMarks3;
    }

    public void setSubjectMarks3(float subjectMarks3) {
        this.subjectMarks3 = subjectMarks3;
    }

    public float getSubjectMarks4() {
        return subjectMarks4;
    }

    public void setSubjectMarks4(float subjectMarks4) {
        this.subjectMarks4 = subjectMarks4;
    }

    public float getSubjectMarks5() {
        return subjectMarks5;
    }

    public void setSubjectMarks5(float subjectMarks5) {
        this.subjectMarks5 = subjectMarks5;
    }

    private int calculateStudentAge()
    {
        int age;
        age = LocalDate.now().getYear()-birthDate.getYear();
        return age;

    }

    public void getPercentage() {
        calculatePercentage();
    }

    public void getResult() {
        calculateResult();
    }

    public void getTotalMarks() {
        calculateMarks();
    }

    public void calculateMarks()
    {
        this.totalMarks = this.subjectMarks1+this.subjectMarks2+this.subjectMarks3+this.subjectMarks4+this.subjectMarks5;
    }

    public void calculatePercentage()
    {
        this.percentage=this.totalMarks/5.0f;
    }

    public void calculateResult()
    {
        if (this.percentage>50)
            this.result="Pass";
        else
            this.result="Fail";
    }

}
