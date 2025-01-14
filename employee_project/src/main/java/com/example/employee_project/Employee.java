package com.example.employee_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     private String name;

     public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
       this.id=id;
        
    }

    public void setName(String name){
       this.name=name;
       
    }


}
