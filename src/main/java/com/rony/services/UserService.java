package com.rony.services;

import com.rony.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        this.userList = new ArrayList<>();
    }

    public List<User> allUsers(){
        return this.userList;
    }

    public void addUser(User user) {
        this.userList.add(user);
    }
}
