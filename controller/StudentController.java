package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.view.StudentView;
import ru.gb.oseminar.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class StudentController implements IUserController{

    private UserView studentsView = new StudentView();
    @Override
    public void create(String firstName, String surName, String lastName) {
        User newStudent = new Student(firstName, lastName, surName, LocalDate.now());
    }

    public void printConsole(List<Student> student){
        studentsView.sendOnConsole(student);
    }
}
