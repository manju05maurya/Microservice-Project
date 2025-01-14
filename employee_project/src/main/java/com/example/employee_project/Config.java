package com.example.employee_project;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
}

// @Configuration
// public class RestTemplateConfig {

//     @Bean
//     RestTemplate restTemplate(){
//         return new RestTemplate();
//     }

// }
