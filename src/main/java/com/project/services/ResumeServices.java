package com.project.services;

import com.project.dao.ResumeDao;
import com.project.model.Resume;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ResumeServices {
    private ResumeDao resumeDao;

    public Resume getById(int id) {
     return resumeDao.findById(id).get();
    }

    public List<Resume> getAll() {
        return resumeDao.findAll();
    }

    public Resume save(Resume resume) {
        return resumeDao.save(resume);
    }

    public void deleteById(int id) {
        resumeDao.deleteById(id);
    }

    public void deleteAll() {
        resumeDao.deleteAll();
    }

    public Resume updateResume(Resume resume) {
        return resumeDao.save(resume);
    }


}
