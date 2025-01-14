package com.example.employee_project;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
// import org.springframework.web.client.RestTemplate;

@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;

    @Autowired
    ModelMapper modelMapper;

    // @Autowired
    // RestTemplate restTemplate;

    // @Autowired
    // AddressClient addressClient;

    // @Value("${addressservice.base.url}")
    // private String addressBaseURL;

    // public EmpService(@Value("${addressservice.base.url}") String addressBaseURL, RestTemplateBuilder builder){
    //     this.restTemplate=builder
    //                         .rootUri(addressBaseURL)
    //                         .build();
    // }

   

    public EmployeeResponse getEmployee(int id){
        
 Employee employee = empRepository.findById(id).get();
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse = modelMapper.map(employee,employeeResponse.getClass());
       

        // AddressResponse addressResponse = restTemplate.getForObject("http://localhost:8081/address/{id}", AddressResponse.class, id);
        // AddressResponse addressResponse = restTemplate.getForObject( "/address/{id}", AddressResponse.class, id);
        //getForObject  getForEntity

        // AddressResponse addressResponse= addressClient.getAddressByEmployeeId(id);

        AddressResponse addressResponse=null;

       

        employeeResponse.setAddressResponse(addressResponse);
        
        // employeeResponse.setId(employee.getID());
        // employeeResponse.setName(employee.getName());
       


        return employeeResponse;
    }

}
