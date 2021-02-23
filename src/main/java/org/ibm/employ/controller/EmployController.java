package com.org.ibm.employ.controller;

import com.org.ibm.employ.model.EmployModel;
import com.org.ibm.employ.repository.EmployRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployController {
    @Autowired
    EmployRepo employRepo;

    @PostMapping("/create")
    public void createEmploy(@RequestBody EmployModel employModel){
        employRepo.save(employModel);
    }
    @GetMapping("/get details")
    public List<EmployModel> getEmployDetails(){
        List<EmployModel> all = employRepo.findAll();
        return all;
    }
}
