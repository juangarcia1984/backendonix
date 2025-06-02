package com.example.backendhonixhome.repositories;

import com.example.backendhonixhome.models.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository <ContactMessage, Long> {
}
