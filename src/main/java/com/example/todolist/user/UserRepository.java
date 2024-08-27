package com.example.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> { //classe que está representando
    UserModel findByUsername(String username);
}
