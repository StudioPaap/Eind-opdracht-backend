package com.novi.eindopdracht_novi_anoukpaap.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Project {

    @Id
        @GeneratedValue
    Long id;

    //Variabele

    private String namme;
    private String   date;
    private String projectmanager;
    private String studiomember;

