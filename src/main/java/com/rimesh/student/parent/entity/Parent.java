package com.rimesh.student.parent.entity;

import com.rimesh.student.abstractEntity.AbstractEntity;
import com.rimesh.student.shared.Status;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Parent extends AbstractEntity {
    private String firstName;
    private String middleName;
    private String lastName;
    private Status status;

}
