package net.ensah.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {

    List<String> users = new ArrayList<>();

    @Override
    public void add(String name) {
     users.add(name);
    }

    @Override
    public void delete(String name) {
     users.remove(name);
    }

    @Override
    public List<String> getAll() {
        return users;
    }
}
