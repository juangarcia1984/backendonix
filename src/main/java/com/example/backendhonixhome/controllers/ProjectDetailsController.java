package com.example.backendhonixhome.controllers;

import com.example.backendhonixhome.models.ProjectDetails;
import com.example.backendhonixhome.repositories.ProjectDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project-details")
public class ProjectDetailsController {
    @Autowired
    private ProjectDetailsRepository projectDetailsRepository;

    @GetMapping
    public List<ProjectDetails> getAll() {
        return projectDetailsRepository.findAll();
    }

    @GetMapping("/{id}")
    public ProjectDetails getById(@PathVariable Long id) {
        return projectDetailsRepository.findById(id).orElse(null);
    }

    @PostMapping
    public ProjectDetails create(@RequestBody ProjectDetails details) {
        return projectDetailsRepository.save(details);
    }

    @PutMapping("/{id}")
    public ProjectDetails update(@PathVariable Long id, @RequestBody ProjectDetails details) {
        details.setId(id);
        return projectDetailsRepository.save(details);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        projectDetailsRepository.deleteById(id);
    }
}
