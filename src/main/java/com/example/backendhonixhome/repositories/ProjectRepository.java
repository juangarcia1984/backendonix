package com.example.backendhonixhome.repositories;

import com.example.backendhonixhome.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <Project, Long> {
}
