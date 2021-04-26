package com.cem.springnativeexample.controller;

import com.cem.springnativeexample.controller.model.User;
import com.cem.springnativeexample.service.UserService;
import com.sun.istack.NotNull;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
//    @PreAuthorize("hasRole('ROLE_VIEWER')")
    public Collection<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
//    @PreAuthorize("hasRole('ROLE_VIEWER')")
    public Optional<User> getUser(@PathVariable @NotNull Long id) {
        return userService.getUser(id);
    }

    @PostMapping
//    @PreAuthorize("hasRole('ROLE_EDITOR')")
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @DeleteMapping("{id}")
//    @PreAuthorize("hasRole('ROLE_EDITOR')")
    public void deleteUser(@PathVariable @NotNull Long id) {
        userService.deleteUser(id);
    }
}
