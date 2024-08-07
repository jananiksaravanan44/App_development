package com.example.demo.repo;

import com.example.demo.model.ContactModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactModel, Long> {
}