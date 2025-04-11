package com.project.services;

import com.project.dao.InterviewDao;
import com.project.model.Interview;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class InterviewServices {
    private InterviewDao interviewDao;

    public List<Interview> getAll() {
        return interviewDao.findAll();
    }

    public Interview getById(int id) {
        return interviewDao.findById(id).get();
    }

    public Interview updateById(Interview interview) {
       return interviewDao.save(interview);
    }

    public void deleteById(int id) {
        interviewDao.deleteById(id);
    }

    public Interview save(Interview interview) {
        return interviewDao.save(interview);
    }

    public void deleteAll() {
        interviewDao.deleteAll();
    }
}
