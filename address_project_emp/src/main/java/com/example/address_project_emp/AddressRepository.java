package com.example.address_project_emp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer>{

    @Query(value = "SELECT a.id, a.city FROM new.address a join  new.employee e  on e.id=a.empId  where e.id=:id", nativeQuery = true)
    public Address getAddressByEmployeeId(@PathVariable int id);
}
