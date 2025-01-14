package com.example.address_project_emp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class AddressController {
    
    @Autowired
    private AddressService addressService;

    @GetMapping("/address/{id}")
    public ResponseEntity<Object> getAddressById(@PathVariable int id) {
        AddressResponse address = addressService.getAddress(id) ;
        if(address ==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("address not found "+ id);
        }
        return ResponseEntity.ok().body(address);
    }
    

}
