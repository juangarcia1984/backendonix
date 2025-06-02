package com.example.backendhonixhome.repositories;

import com.example.backendhonixhome.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
