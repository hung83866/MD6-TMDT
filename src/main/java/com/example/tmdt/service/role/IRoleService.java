package com.example.tmdt.service.role;

import com.example.tmdt.model.Role;
import com.example.tmdt.model.RoleName;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IRoleService {
    Optional<Role> findByName(RoleName name);
}
