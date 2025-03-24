package me.dio.service;

import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import org.springframework.stereotype.Service;


public interface UserService {
    User findById(Integer id);
    User create(User user);

}
