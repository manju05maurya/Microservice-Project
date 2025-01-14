package com.example.address_project_emp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
     ModelMapper modelMapper;

    public AddressResponse getAddress(int id){
        Address address = addressRepository.getAddressByEmployeeId(id); //DB call

        AddressResponse addressResponse = new AddressResponse();

         addressResponse = modelMapper.map(address,AddressResponse.class);

        // addressResponse.setId(address.getId());
        // addressResponse.setCity(address.getCity());

        return addressResponse;

    }

}
