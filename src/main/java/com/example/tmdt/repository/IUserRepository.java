package com.example.tmdt.repository;

import com.example.tmdt.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<AppUser,Long> {
}
