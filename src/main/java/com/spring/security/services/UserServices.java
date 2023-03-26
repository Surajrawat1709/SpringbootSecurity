package com.spring.security.services;

import com.spring.security.entity.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {

    List<User> list=new ArrayList<>();

    public UserServices(){

        list.add(new User("Suraj","sur","sr@gmail.com"));
        list.add(new User("Pankaj","pan","pr@gmail.com"));
    }

    public List<User> getAllUsers(){
        return this.list;
    }

    public User getSingleUser(String name){
        return this.list.stream().filter(user->user.getUsername().equals(name)).findAny().orElse(null);
    }

public User addUser(User user){
        this.list.add(user);
        return user;
}


}
