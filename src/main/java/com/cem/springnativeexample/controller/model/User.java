package com.cem.springnativeexample.controller.model;

import com.cem.springnativeexample.repository.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String name;
    private String surname;

    public static Optional<User> of(Optional<UserEntity> userEntity) {
        return userEntity.map(u -> User.builder()
                .id(u.getId())
                .name(u.getName())
                .surname(u.getSurname()).build());
    }

    public static User of(UserEntity userEntity) {
        return User.builder()
                .id(userEntity.getId())
                .name(userEntity.getName())
                .surname(userEntity.getSurname()).build();
    }
}
