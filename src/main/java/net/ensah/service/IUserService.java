package net.ensah.service;

import java.util.List;

public interface IUserService {

    void add(String name);
    void delete(String name);
    List<String>  getAll() throws InterruptedException;
}
