package com.kodilla.abstracts.homework;

public abstract class Job {

    private int salary;
    private String responsibilities;

    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public int getSalary() {
        return this.salary;
    }
    public String getResponsibilities() {
        return this.responsibilities;
    }
}
