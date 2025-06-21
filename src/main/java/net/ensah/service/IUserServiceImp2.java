package net.ensah.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IUserServiceImp2 {

    List<String> users = new ArrayList<>();


    public void add(String name) {
        users.add(name);
    }


    public void delete(String name) {
        users.remove(name);
    }


    public List<String> getAll() {
        return users;
    }
}
