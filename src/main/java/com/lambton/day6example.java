package com.lambton;

import java.time.LocalDate;

public class day6example {

    public static void main(String[] args) {

        LocalDate s1DateOfBirth = LocalDate.of(1996,01,05);
        Student st = new Student(778829,"Kritima","Kukreja",s1DateOfBirth,Gender.FEMALE);
        st.setSubjectMarks1(50);
        st.setSubjectMarks2(75);
        st.setSubjectMarks3(100);
        st.setSubjectMarks4(25);
        st.setSubjectMarks5(81);
        st.calculateMarks();
        st.calculatePercentage();
        st.calculateResult();
       st.printData();

       //second student object
        LocalDate s2DateOfBirth = LocalDate.of(1995,05,04);
        Student st2 = new Student(778823,"Monika","Sharma",s2DateOfBirth,Gender.FEMALE);
        st2.setSubjectMarks1(10);
        st2.setSubjectMarks2(25);
        st2.setSubjectMarks3(9);
        st2.setSubjectMarks4(15);
        st2.setSubjectMarks5(27);
        st2.calculateMarks();
        st2.calculatePercentage();
        st2.calculateResult();
        st2.printData();
    }
}
