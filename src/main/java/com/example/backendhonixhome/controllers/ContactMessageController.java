package com.example.backendhonixhome.controllers;

import com.example.backendhonixhome.models.ContactMessage;
import com.example.backendhonixhome.repositories.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")

@RestController
@RequestMapping("/api/contact-messages")
public class ContactMessageController {
    @Autowired
    private ContactMessageRepository contactMessageRepository;

    @GetMapping
    public List<ContactMessage> getAll() {
        return contactMessageRepository.findAll();
    }

    @GetMapping("/{id}")
    public ContactMessage getById(@PathVariable Long id) {
        return contactMessageRepository.findById(id).orElse(null);
    }

    @PostMapping
    public ContactMessage create(@RequestBody ContactMessage message) {
        return contactMessageRepository.save(message);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        contactMessageRepository.deleteById(id);
    }
}
