package com.rimesh.student.user.entity;

import com.rimesh.student.abstractEntity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="users")
@Getter
@Setter
@ToString
public class User extends AbstractEntity  {

    @Column(unique = true,nullable = false)
    private String email;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private  String password;


}
