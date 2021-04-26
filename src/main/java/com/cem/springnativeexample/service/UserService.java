package com.cem.springnativeexample.service;

import com.cem.springnativeexample.controller.model.User;
import com.cem.springnativeexample.repository.UserRepository;
import com.cem.springnativeexample.repository.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUser(Long id) {
        Optional<UserEntity> userEntity = userRepository.findById(id);
        return User.of(userEntity);
    }

    public List<User> getUsers() {
        return userRepository.findAll().stream()
                .map(userEntity -> User.of(userEntity))
                .collect(Collectors.toList());
    }

    public void createUser(User user) {
        UserEntity userEntity = UserEntity.of(user);
        userRepository.save(userEntity);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
