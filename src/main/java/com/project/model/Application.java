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
@Table(name = "application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "application_id")
    private int applicationId;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User userId;

    @ManyToOne()
    @JoinColumn(name = "jod_id")
    private Job jodId;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime appliedAt;
}
