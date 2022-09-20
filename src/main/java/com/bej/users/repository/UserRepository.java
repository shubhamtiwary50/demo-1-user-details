package com.bej.users.repository;

import com.bej.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends
        JpaRepository<User,String> {
    List<User> findByLastName(String lastName);

}


