package com.electro.electro_app.infraestructure.repository.User;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.electro.electro_app.application.service.IUserService;
import com.electro.electro_app.domain.entities.User;

@Service
public class UserImpl implements IUserService {
    
    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter( usr -> usr.getId().equals(id) ).findFirst();
    }

}
