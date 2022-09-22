package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        Teacher romanZielony = new Teacher("Roman Zielony");
        Teacher zbigniewNiebieski = new Teacher("Zbigniew Niebieski");
        Teacher jadwigaCzerwona = new Teacher("Jadwiga Czerwona");


        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam",null));
        students.add(new Student("Pawel",romanZielony));
        students.add(new Student("Marcin",zbigniewNiebieski));
        students.add(new Student("Bartek",null));
        students.add(new Student("Piotr",romanZielony));
        students.add(new Student("Michal",zbigniewNiebieski));
        students.add(new Student("Natalia",jadwigaCzerwona));
        students.add(new Student("Daria",null));


        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            String name = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("uczen: " + student.getName() + ", " + "nauczyciel: " + name);

        }

    }
}
