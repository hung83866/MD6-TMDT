package com.example.tmdt.service.role;

import com.example.tmdt.model.Role;
import com.example.tmdt.model.RoleName;
import com.example.tmdt.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceIMPL implements IRoleService {
    @Autowired
    IRoleRepository roleRepository;
    public Optional<Role> findByName(RoleName name) {
        return roleRepository.findByName(name);
    }
}
