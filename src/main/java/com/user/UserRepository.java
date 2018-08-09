package com.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 */

public interface UserRepository extends JpaRepository<User, Long>{
    @Modifying
    @Query("update User u set u.headerColor = ?1 where u.id = ?2")
    void setHeaderColorById(String headerColor, Long id);

    List<User> findByUsername(String username);
}