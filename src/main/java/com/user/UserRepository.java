package com.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

/**
 *
 */

public interface UserRepository extends JpaRepository<User, Long>{
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update User u set u.colors = ?1 where u.id = ?2")
    void setColorsById(String colors, Long id);

    List<User> findByUsername(String username);
}