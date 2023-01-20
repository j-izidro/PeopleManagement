package com.example.PeopleManagement.Service;

import com.example.PeopleManagement.Model.Person;
import com.example.PeopleManagement.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public List<Person> getAll() {
        return personRepository.findAll();
    }
}