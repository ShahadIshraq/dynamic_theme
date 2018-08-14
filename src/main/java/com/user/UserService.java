package com.user;

import org.hibernate.jdbc.BatchedTooManyRowsAffectedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User find(String username) {
        List<User> list = userRepository.findByUsername(username);
        if (list.size() == 0) return null;
        if (list.size() > 1) throw new BatchedTooManyRowsAffectedException("Too many user found", list.size(), 1, -1);
        return list.get(0);
    }

    public User findOne(Long id){
        return userRepository.findOne(id);
    }

    public void updateColor(String colors, Long id){userRepository.setColorsById(colors, id);}
}