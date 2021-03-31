package com.aor.refactoring.example4;

import java.util.Objects;

public class Worker extends Person{

    final String username;
    final String password;

    public Worker(String name, String phone, String username, String password) {
        super(name, phone);
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker person = (Worker) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(phone, person.phone) &&
                Objects.equals(username, person.username) &&
                Objects.equals(password, person.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, username, password);
    }
}
