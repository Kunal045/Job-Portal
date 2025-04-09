package com.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "job_id")
    private int id;
    private String title;
    private String description;
    private String company;
    private String location;
    @Enumerated(EnumType.STRING)
    private EmploymentType employmenttype;
    @Enumerated(EnumType.STRING)
    private ExperienceType experiencetype;
    private String salaryRange;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User postedBy;


}
