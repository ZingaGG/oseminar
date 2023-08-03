package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.TeacherService;
import ru.gb.oseminar.view.TeacherView;
import ru.gb.oseminar.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class TeacherController implements IUserController<Teacher> {
    private UserView teacherView = new TeacherView(); // Возможна абстратктная реализация, путем создания поля интерфейса
    private TeacherService teacherService = new TeacherService();
    @Override
    public void create(String firstName, String surName, String lastName) {
        Teacher teacher = new Teacher(firstName, surName, lastName, LocalDate.now());
    }

    public void printConsole(List<Teacher> teacher) {
        teacherView.sendOnConsole(teacher);
    }

    public void editSecondName(String firstName, String old_secondName, String new_secondName) throws Exception {
        Teacher redactTeacher = teacherService.getTeacher(firstName, old_secondName);
        teacherService.removeTeacher(redactTeacher);
        redactTeacher.setSecondName(new_secondName);
        teacherService.addTeacher(redactTeacher);
    }
}
