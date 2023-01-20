package com.example.PeopleManagement.Controller;

import com.example.PeopleManagement.Model.Person;
import com.example.PeopleManagement.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import java.util.List;

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
    @GetMapping("/test")
    public String Test(){
        return "Hello";
    }
}
