package com.example.backendhonixhome.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "project_details")
public class ProjectDetails {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 2000, nullable = false)
    private String detailedDescription;

    @OneToOne
    @JoinColumn(name = "project_id", referencedColumnName = "id", nullable = false)
    @JsonBackReference
    private Project project;

    @OneToMany(mappedBy = "projectDetails", cascade = CascadeType.ALL)
    private Set<ProjectInquiry> inquiries;




    public ProjectDetails() {
    }

    public ProjectDetails(Long id, String detailedDescription, Project project, Set<ProjectInquiry> inquiries) {
        this.id = id;
        this.detailedDescription = detailedDescription;
        this.project = project;
        this.inquiries = inquiries;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Set<ProjectInquiry> getInquiries() {
        return inquiries;
    }

    public void setInquiries(Set<ProjectInquiry> inquiries) {
        this.inquiries = inquiries;
    }
}


