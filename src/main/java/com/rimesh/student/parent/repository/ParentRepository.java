package com.rimesh.student.parent.repository;

import com.rimesh.student.parent.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent,Long> {
}
