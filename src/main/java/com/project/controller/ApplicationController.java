package com.project.controller;

import com.project.model.Application;
import com.project.model.Job;
import com.project.model.User;
import com.project.services.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/app")
public class ApplicationController {
    private ApplicationService applicationService;
  @GetMapping
    public List<Application> findAll() {
        return applicationService.findAll();
    }
    @PostMapping("/{id}")
    public Application getById(@PathVariable("id") int id) {
      return applicationService.getById(id);
    }

    @PostMapping
    public Application createJob(@RequestBody Application application) {
        return applicationService.save(application);
    }

    @PutMapping
    public Application updateJob(@RequestBody Application application) {
      return applicationService.updateJob(application);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable("id") int id) {
       applicationService.deleteJob(id);
    }

    @DeleteMapping
    public void deleteAllJob() {
      applicationService.deleteAllJob();
    }

}
