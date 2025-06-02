package com.example.backendhonixhome.services;

import com.example.backendhonixhome.models.ContactMessage;
import com.example.backendhonixhome.repositories.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactMessageService {
    @Autowired
    private ContactMessageRepository contactMessageRepository;

    public List<ContactMessage> findAll() {
        return contactMessageRepository.findAll();
    }

    public Optional<ContactMessage> findById(Long id) {
        return contactMessageRepository.findById(id);
    }

    public ContactMessage save(ContactMessage message) {
        return contactMessageRepository.save(message);
    }

    public void deleteById(Long id) {
        contactMessageRepository.deleteById(id);
    }
}
