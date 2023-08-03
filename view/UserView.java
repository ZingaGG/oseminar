package ru.gb.oseminar.view;

import java.util.List;

import ru.gb.oseminar.data.User;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> listT);
}
