package com.example.tmdt.service.user;

import com.example.tmdt.model.AppUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IUserService {
    Optional<AppUser> findByUsername(String username);//Tim kiem User co ton tai trong DB khong?
    Boolean existsByUsername(String username);//username da co trong DB chua, khi tao du lieu
    Boolean existsByEmail(String email);//email da co trong DB chua
    Page<AppUser> findAll(Pageable pageable); //Page User
    Iterable<AppUser> findAll();
}
