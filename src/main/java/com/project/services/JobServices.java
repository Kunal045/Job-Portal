package com.project.services;

import com.project.dao.JobDao;
import com.project.dto.JobDto;
import com.project.mapper.JobMapper;
import com.project.model.Job;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class JobServices {
private JobDao jobDao;

   public List<Job> findAll() {
        return jobDao.findAll();
   }
   public JobDto findById(int id) {
       return JobMapper.getJobDto(jobDao.findById(id).get());
   }
   public Job createJob(Job job) {
       job.setCreatedAt(LocalDateTime.now());
   return jobDao.save(job);
   }

   public Job updateJob(Job job) {
       job.setUpdatedAt(LocalDateTime.now());
       return jobDao.save(job);
   }

   public void deleteJob(int id) {
       jobDao.deleteById(id);
   }

   public void deleteAllJob() {
       jobDao.deleteAll();
   }
}
