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

        List<User> userList = new ArrayList<>();
        userList.add(new User("shahad","123","#cecece"));
        userList.add(new User("ishraq","456","#000000"));
        userList.add(new User("farabi","789","#ffffff"));


        userRepository.save(userList);
//        bookingRepository.save

//        List<Project> projectList = new ArrayList<>();
//        Project project = new Project();
//
//
//        projectList.add((new Project("proj 1",Long.valueOf(1))));
//        projectList.add((new Project("proj 2",Long.valueOf(2))));
//        projectList.add((new Project("proj 3",Long.valueOf(1))));
//        projectList.add((new Project("proj 4",Long.valueOf(1))));
//        projectList.add((new Project("PROJ 5",Long.valueOf(1))));
//        projectService.save(projectList);
//
//        List<Column> columnList = new ArrayList<>();
//
//
//        columnList.add((new Column("col 1",1,Long.valueOf(1),Long.valueOf(1))));
//        columnList.add((new Column("col 2",2,Long.valueOf(2),Long.valueOf(2))));
//        columnList.add((new Column("col 3",3,Long.valueOf(1),Long.valueOf(1))));
//        columnList.add((new Column("col 2",2,Long.valueOf(1),Long.valueOf(1))));
//        columnList.add((new Column("col 4",4,Long.valueOf(1),Long.valueOf(1))));
//        columnList.add((new Column("col 5",5,Long.valueOf(1),Long.valueOf(1))));
//        columnList.add((new Column("col 6",6,Long.valueOf(1),Long.valueOf(1))));
//        columnList.add((new Column("col 7",7,Long.valueOf(1),Long.valueOf(1))));
//
//        System.out.println(columnList.toString());
//
//        columnService.save(columnList);
//
//
//
//        List<Card> cardList = new ArrayList<>();
//        Long projectId = Long.valueOf(1);
//        cardList.add(new Card("card a",1,Long.valueOf(1),Long.valueOf(2),Long.valueOf(1), projectId, "1  Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis,","urgent",new Date()));
//        cardList.add(new Card("card b",2,Long.valueOf(1),Long.valueOf(2),Long.valueOf(1), projectId, "2  Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis,","urgent",new Date()));
//        cardList.add(new Card("card c",1,Long.valueOf(4),Long.valueOf(2),Long.valueOf(1), projectId, "3  Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis,","urgent",new Date()));
//        cardList.add(new Card("card d",2,Long.valueOf(4),Long.valueOf(2),Long.valueOf(1), projectId, "4  Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis,","urgent",new Date()));
//        cardList.add(new Card("card e",1,Long.valueOf(3),Long.valueOf(2),Long.valueOf(1), projectId, "5  Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis,","urgent",new Date()));
//        cardList.add(new Card("card f",2,Long.valueOf(3),Long.valueOf(2),Long.valueOf(1), projectId, "6  Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis,","urgent",new Date()));
//        cardList.add(new Card("card g",1,Long.valueOf(5),Long.valueOf(2),Long.valueOf(1), projectId, "7  Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis,","urgent",new Date()));
//        cardList.add(new Card("card h",1,Long.valueOf(6),Long.valueOf(2),Long.valueOf(1), projectId, "8  Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis,","urgent",new Date()));
//        cardList.add(new Card("card i",1,Long.valueOf(7),Long.valueOf(2),Long.valueOf(1), projectId, "9  Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis,","urgent",new Date()));
//        cardList.add(new Card("card j",2,Long.valueOf(7),Long.valueOf(2),Long.valueOf(1), projectId, "10  Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis,","urgent",new Date()));
//        cardList.add(new Card("card k",1,Long.valueOf(8),Long.valueOf(2),Long.valueOf(1), projectId, "11  Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis,","urgent",new Date()));
//
//        System.out.println(cardList.toString());
//        cardService.save(cardList);




    }
}
