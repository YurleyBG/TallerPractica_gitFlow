package com.electro.electro_app.application.service;


import java.util.List;
import java.util.Optional;

import com.electro.electro_app.domain.entities.User;

public interface  IUserService {
    List<User> findAll();
    Optional<User> findById(Long id);
}
