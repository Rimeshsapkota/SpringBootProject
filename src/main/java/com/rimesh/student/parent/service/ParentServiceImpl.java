package com.rimesh.student.parent.service;

import com.rimesh.student.parent.entity.Parent;
import com.rimesh.student.parent.repository.ParentRepository;
import com.rimesh.student.shared.Status;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ParentServiceImpl implements ParentService{
    private final ParentRepository parentRepository;

    public ParentServiceImpl (ParentRepository parentRepository){
        this.parentRepository=parentRepository;
    }



    @Override
    public List<Parent> getParentDetails() {
        return parentRepository.findAll();
    }

    @Override
    public Parent createParent(Parent parent) {
        parent.setStatus(Status.ACTIVE);
        return  parentRepository.save(parent);
    }



}
