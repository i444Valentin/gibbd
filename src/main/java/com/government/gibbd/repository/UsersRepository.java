package com.government.gibbd.repository;

import com.government.gibbd.entity.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository<Users, Long> {
    List<Users> findAll();
    Users findDistinctByLoginAndPassword(String logins, String passwords);
}

