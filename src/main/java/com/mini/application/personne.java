package com.mini.application;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lompbok.Data;
@com.mini.application.Data
@Entity
@Table(name="personne")
public class personne {
    @Id
    private Long id;
    
}
