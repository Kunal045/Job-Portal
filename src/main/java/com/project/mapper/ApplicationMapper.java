package com.project.mapper;

import com.project.dto.ApplicationDto;
import com.project.model.Application;

public class ApplicationMapper {
    public static ApplicationDto toApplicationDto(Application application) {
       return ApplicationDto.builder()
               .applicationId(application.getApplicationId())
               .id(application.getUserId())
               .jodId(application.getJodId())
               .status(application.getStatus())
               .build();

    }
}
