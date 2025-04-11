package com.project.dao;

import com.project.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface ResumeDao extends JpaRepository<Resume, Integer> {
}
