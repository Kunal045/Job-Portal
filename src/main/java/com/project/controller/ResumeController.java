package com.project.controller;

import com.project.dao.ResumeDao;
import com.project.model.Resume;
import com.project.services.ResumeServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/resume")
public class ResumeController {
    private ResumeServices  resumeServices;
    @GetMapping("/{id}")
    public Resume getById(@PathVariable("id") int id) {
     return resumeServices.getById(id);
    }

    @GetMapping
    public List<Resume> getAll() {
        return resumeServices.getAll();
    }

    @PostMapping
    public Resume save(@RequestBody Resume resume) {
        return resumeServices.save(resume);
    }


    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
        resumeServices.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
        resumeServices.deleteAll();
    }

    @PutMapping 
    public Resume updateResume(@RequestBody Resume resume) {
        return resumeServices.save(resume);
    }


}
