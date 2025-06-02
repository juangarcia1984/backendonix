package com.example.backendhonixhome.services;

import com.example.backendhonixhome.models.ProjectInquiry;
import com.example.backendhonixhome.repositories.ProjectInquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectInquiryService {
    @Autowired
    private ProjectInquiryRepository projectInquiryRepository;

    public List<ProjectInquiry> findAll() {
        return projectInquiryRepository.findAll();
    }

    public Optional<ProjectInquiry> findById(Long id) {
        return projectInquiryRepository.findById(id);
    }

    public ProjectInquiry save(ProjectInquiry inquiry) {
        return projectInquiryRepository.save(inquiry);
    }

    public void deleteById(Long id) {
        projectInquiryRepository.deleteById(id);
    }
}
