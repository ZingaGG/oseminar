package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> listT) {
        System.out.println("Список студентов");
        for (Teacher teacher: listT) {
            System.out.println(teacher.getTeacherId());
        }
    }
}
