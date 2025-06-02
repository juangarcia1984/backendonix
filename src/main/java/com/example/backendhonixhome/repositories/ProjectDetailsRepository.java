package com.example.backendhonixhome.repositories;

import com.example.backendhonixhome.models.ProjectDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectDetailsRepository extends JpaRepository <ProjectDetails, Long> {
}
