package com.example.employee_project;

public class EmployeeResponse {

    private int id;
    private String name;

    private AddressResponse AddressResponse;

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public AddressResponse getAddressResponse(){
        return AddressResponse;
    }
    

    public void setId(int id){
       this.id=id;
        
    }

    public void setName(String name){
       this.name=name;
       
    }

    public void setAddressResponse(AddressResponse AddressResponse){
        this.AddressResponse=AddressResponse;;
    }



}
