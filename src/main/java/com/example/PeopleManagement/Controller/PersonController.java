package com.example.PeopleManagement.Controller;

import com.example.PeopleManagement.Model.Person;
import com.example.PeopleManagement.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Person>> getAll(){
        try {
            return ResponseEntity.ok(personService.getAll());
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/create")
    public ResponseEntity<Person> create(@RequestBody Person person){
        try{
            return ResponseEntity.ok(personService.create(person));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("personId") int personId){
        try{
            personService.delete(personId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{personId}")
    public ResponseEntity<Person> update(@PathVariable("personId") int personId, @RequestBody Person person){
        Optional<Person> personData = personService.getById(personId);

        if (personData.isPresent()){
            Person _person = personData.get();
            _person.setId(person.getId());
            _person.setCity(person.getCity());
            _person.setName(person.getName());
            _person.setNumber(person.getNumber());
            _person.setBirthDate(person.getBirthDate());
            _person.setLocationType(person.getLocationType());
            _person.setZipCode(person.getZipCode());
            return new ResponseEntity<>(personService.create(_person), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
