package com.example.demo.service;

import com.example.demo.model.ContactModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private com.example.demo.repo.ContactRepository contactRepository;

    public ContactModel saveMessage(ContactModel contactModel) {
        return contactRepository.save(contactModel);
    }

    public List<ContactModel> getAllMessages() {
        return contactRepository.findAll();
    }

    public ContactModel getMessageById(Long id) {
        return contactRepository.findById(id).orElse(null);
    }
}