package com.project.dto;

import com.project.model.EmploymentType;
import com.project.model.ExperienceType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class JobDto {
    private int id;
    private String title;
    private String company;
    private String location;
    @Enumerated(EnumType.STRING)
    private EmploymentType employmenttype;
    @Enumerated(EnumType.STRING)
    private ExperienceType experiencetype;
    private String salaryRange;
}
