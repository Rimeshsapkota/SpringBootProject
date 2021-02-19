package com.rimesh.student.parent.controller;
import com.rimesh.student.admin.service.AdminService;
import com.rimesh.student.parent.entity.Parent;
import com.rimesh.student.parent.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController

public class ParentController  {

    private final ParentService parentService;

    public ParentController(ParentService parentService){
        this.parentService = parentService;
    }

    @GetMapping("/api/parents")
    public List<Parent> getParentDetails(){
        return   parentService.getParentDetails();
    }

    @PostMapping("/api/parent")
    public Parent CreateParent( @RequestBody Parent parent){
        return parentService.createParent(parent);
    }

}
