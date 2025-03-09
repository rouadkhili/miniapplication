package com.mini.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonController {
    @Autowired
    personrepo repo;

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody personne personne){
        repo.save(personne);
    }
}
