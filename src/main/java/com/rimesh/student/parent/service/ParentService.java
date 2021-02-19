package com.rimesh.student.parent.service;

import com.rimesh.student.parent.entity.Parent;

import java.util.List;


public interface ParentService  {
   List<Parent> getParentDetails();
   Parent createParent(Parent parent);

}
