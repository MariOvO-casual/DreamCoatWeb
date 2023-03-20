package com.example.staybooking.repository;

import com.example.staybooking.model.User;
// 为了增删改查设置的
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}