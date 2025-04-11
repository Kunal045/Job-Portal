package com.project.controller;

import com.project.dao.InterviewDao;
import com.project.model.Interview;
import com.project.services.InterviewServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/interview")
public class InterviewController {
    private InterviewServices interviewServices;

    @GetMapping
    public List<Interview> getInterviews() {
        return interviewServices.getAll();
    }

    @GetMapping("/{id}")
    public Interview getInterviewsByJobId(@PathVariable("id") int id) {
            return interviewServices.getById(id);
    }

    @PostMapping
    public Interview addInterview(@RequestBody Interview interview) {
        return interviewServices.save(interview);
    }

    @PutMapping
    public Interview updateInterview(@RequestBody Interview interview) {
        return interviewServices.save(interview);
    }

    @DeleteMapping("/{id}")
    public void deleteInterview(@PathVariable("id") int id) {
        interviewServices.deleteById(id);
    }


    @DeleteMapping
    public void deleteAllInterviews() {
        interviewServices.deleteAll();
    }

}
