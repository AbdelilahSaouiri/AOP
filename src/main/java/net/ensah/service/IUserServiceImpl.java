package net.ensah.service;

import net.ensah.Aspect.Time;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class IUserServiceImpl implements IUserService {

    List<String> users = new ArrayList<>();

    @Time
    @Override
    public void add(String name) {
     users.add(name);
    }

    @Time
    @Override
    public void delete(String name) {
     users.remove(name);
    }

    @Time
    @Override
    public List<String> getAll() throws InterruptedException {
        Thread.sleep(1500);
        return users;
    }
}
