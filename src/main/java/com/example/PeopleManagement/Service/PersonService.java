package com.example.PeopleManagement.Service;

import com.example.PeopleManagement.Model.Person;
import com.example.PeopleManagement.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public List<Person> getAll() {
        return personRepository.findAll();
    }
    public Optional<Person> getById(int personId) {return personRepository.findById(personId);}
    public Person create(Person person) {return personRepository.save(person); }
    public void delete(int personId) {personRepository.deleteById(personId);}

}