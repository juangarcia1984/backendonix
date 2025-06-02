package com.example.backendhonixhome.services;

import com.example.backendhonixhome.models.ProjectDetails;
import com.example.backendhonixhome.repositories.ProjectDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectDetailsService {
    @Autowired
    private ProjectDetailsRepository projectDetailsRepository;

    public List<ProjectDetails> findAll() {
        return projectDetailsRepository.findAll();
    }

    public Optional<ProjectDetails> findById(Long id) {
        return projectDetailsRepository.findById(id);
    }

    public ProjectDetails save(ProjectDetails details) {
        return projectDetailsRepository.save(details);
    }

    public void deleteById(Long id) {
        projectDetailsRepository.deleteById(id);
    }
}
