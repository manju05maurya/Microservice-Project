package com.example.employee_project;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/employees/{id}")
    public ResponseEntity<Object> getMethodName(@PathVariable("id") int id) {
        EmployeeResponse employee= empService.getEmployee(id);
        if(employee == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("employee not found" + id);
        }
        return ResponseEntity.ok().body(employee);
        
    }
    
}
