package com.misc;

import com.user.User;
import com.user.UserRepository;
import com.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class Seeder implements CommandLineRunner {

    private UserRepository userRepository;

    @Autowired
    public Seeder(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Autowired
    UserService userService;

    @Override
    public void run(String... args) throws Exception {

        // username, password,  headerColor,  columnHeaderColor,  boardBackgroundColor,  pageBackgroundColor,  footerColor
        List<User> userList = new ArrayList<>();
        userList.add(new User("shahad","123","#0079bf#ff931e#e2e4e6#4d4d4d#333333"));
        userList.add(new User("ishraq","456","#ff931e#0079bf#e2e4e6#4d4d4d#333333"));
        userList.add(new User("farabi","789","#e2e4e6#0079bf#ff931e#4d4d4d#333333"));


        userRepository.save(userList);

    }
}
