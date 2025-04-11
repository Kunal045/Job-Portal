package com.project.mapper;

import com.project.dto.JobDto;
import com.project.model.Job;

public class JobMapper {
    public static JobDto getJobDto(Job job) {
        return JobDto.builder()
                .id(job.getId())
                .title(job.getTitle())
                .company(job.getCompany())
                .location(job.getLocation())
                .employmenttype(job.getEmploymenttype())
                .experiencetype(job.getExperiencetype())
                .build();
    }
    public static Job getJob(JobDto jobDto) {
        return Job.builder()
                .id(jobDto.getId())
                .title(jobDto.getTitle())
                .company(jobDto.getCompany())
                .location(jobDto.getLocation())
                .employmenttype(jobDto.getEmploymenttype())
                .experiencetype(jobDto.getExperiencetype())
                .build();
    }
}
