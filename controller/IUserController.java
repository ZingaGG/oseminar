package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.User;

public interface IUserController<T extends User> {
    void create(String firstName, String surName, String lastName);
}
