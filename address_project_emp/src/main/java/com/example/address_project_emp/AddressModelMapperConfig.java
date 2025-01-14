package com.example.address_project_emp;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressModelMapperConfig {
    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
    

}
