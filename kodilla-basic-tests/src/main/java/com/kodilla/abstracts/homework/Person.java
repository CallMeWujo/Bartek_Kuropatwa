package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private Job job;


    public Person (String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void returnResponsibilities() {
        System.out.println(getFirstName() + " resposibilities at work are : " + job.getResponsibilities() );
    }
}
