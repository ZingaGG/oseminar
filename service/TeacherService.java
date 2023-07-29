package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Teacher;

import java.util.List;

public class TeacherService {

    private List<Teacher> groupTeacher;

    public void createGroup(List<Teacher> teachers){
        this.groupTeacher = teachers;
    }

    public void addTeacher(Teacher teacher){
        groupTeacher.add(teacher);
    }

    public void removeTeacher(Teacher teacher) throws Exception {
        if(groupTeacher.contains(teacher)){
            groupTeacher.remove(teacher);
            return;
        }
        throw new Exception("Teacher does not exists");
    }

    public Teacher getTeacher(String firstName, String secondName) throws Exception {
        for (Teacher teacher: groupTeacher) {
            if(teacher.getFirstName().equals(firstName) && teacher.getSecondName().equals(secondName)){
                return teacher;
            }
        }
        throw new Exception("Teacher does not exists");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Teacher teacher: groupTeacher) {
            sb.append(teacher).append("\n");
        }
        return sb.toString();
    }
}
