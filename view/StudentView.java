package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;

import java.util.List;


public class StudentView implements UserView<Student>{

    @Override
    public void sendOnConsole(List<Student> listT) {
        System.out.println("Список студентов");
        for (Student student: listT) {
            System.out.println(student.getStudentId());
        }
    }
}
