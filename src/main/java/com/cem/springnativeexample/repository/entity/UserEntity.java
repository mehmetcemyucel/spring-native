package com.cem.springnativeexample.repository.entity;

import com.cem.springnativeexample.controller.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;

    public static UserEntity of(User user) {
        return new UserEntity(user.getId(), user.getName(), user.getSurname());
    }
}
