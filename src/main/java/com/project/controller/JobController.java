package com.project.controller;

import com.project.dto.JobDto;
import com.project.model.Job;
import com.project.services.JobServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/job")
public class JobController {
private JobServices jobServices;

   @GetMapping
   public List<Job> getAllJobs() {
       return jobServices.findAll();
   }

  @GetMapping("/{id}")
   public JobDto getJobById(@PathVariable("id") int id) {
       return jobServices.findById(id);
   }

   @PostMapping
   public Job createJob(@RequestBody Job job) {
   return jobServices.createJob(job);
   }
    @PutMapping
   public Job updateJob(@RequestBody  Job job) {
       return jobServices.updateJob(job);
   }

 @DeleteMapping("/{id}")
   public void deleteJob(@PathVariable("id") int id) {
       jobServices.deleteJob(id);
   }


   @DeleteMapping("/all")
   public void deleteAllJob() {
       jobServices.deleteAllJob();
   }
}
