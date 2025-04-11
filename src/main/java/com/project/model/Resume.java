package com.project.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Entity
@Table(name = "resume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "resume_id")
    private int id;

    private String resume_url;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;

    private LocalDateTime created_at;
}
