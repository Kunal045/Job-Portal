package com.project.dto;


import com.project.model.Job;
import com.project.model.Status;

import com.project.model.User;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class ApplicationDto {
    private int applicationId;
    private User id;
    private Job jodId;
    @Enumerated(EnumType.STRING)
    private Status status;
}
