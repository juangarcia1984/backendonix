package com.example.backendhonixhome.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "project_inquiries")
public class ProjectInquiry {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String message;
    @Column(nullable = false)
    private LocalDateTime sentAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "project_details_id", nullable = false)
    private ProjectDetails projectDetails;

    public ProjectInquiry() {
    }

    public ProjectInquiry(Long id, String name, String email, String message, LocalDateTime sentAt, ProjectDetails projectDetails) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.message = message;
        this.sentAt = sentAt;
        this.projectDetails = projectDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public ProjectDetails getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(ProjectDetails projectDetails) {
        this.projectDetails = projectDetails;
    }
}

