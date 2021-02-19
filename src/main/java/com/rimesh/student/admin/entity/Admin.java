package com.rimesh.student.admin.entity;

import com.rimesh.student.abstractEntity.AbstractEntity;

import com.rimesh.student.shared.Status;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Setter
@Getter
public class Admin extends AbstractEntity {
    //@Id //primary key
    //@GeneratedValue(strategy = GenerationType.AUTO)//automatic generate
    //private Long id; //primary key- unique
    private String firstName; //by default column name: first_name
    private String middleName;
    private String lastName;
    private Status status;
}
