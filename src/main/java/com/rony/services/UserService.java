package com.rony.services;

import com.rony.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService extends BaseService<User>{

    private List<User> userList;

    public UserService() {
        super(new User());
        userList = new ArrayList<>();
    }

    public List<User> allUsers(){
        List<User> userList = getAll();
        return userList;
    }

    public void addUser(User user) {
        this.userList.add(user);
        save(user);
    }

    public void deleteUser(User user){
        delete(user);
    }

}
