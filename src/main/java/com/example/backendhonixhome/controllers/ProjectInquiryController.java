package com.example.backendhonixhome.controllers;

import com.example.backendhonixhome.models.ProjectInquiry;
import com.example.backendhonixhome.repositories.ProjectInquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project-inquiries")
public class ProjectInquiryController {
    @Autowired
    private ProjectInquiryRepository projectInquiryRepository;

    @GetMapping
    public List<ProjectInquiry> getAll() {
        return projectInquiryRepository.findAll();
    }

    @GetMapping("/{id}")
    public ProjectInquiry getById(@PathVariable Long id) {
        return projectInquiryRepository.findById(id).orElse(null);
    }

    @PostMapping
    public ProjectInquiry create(@RequestBody ProjectInquiry inquiry) {
        return projectInquiryRepository.save(inquiry);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        projectInquiryRepository.deleteById(id);
    }
}
