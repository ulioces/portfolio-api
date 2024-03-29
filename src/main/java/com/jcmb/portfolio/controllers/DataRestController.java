package com.jcmb.portfolio.controllers;

import com.jcmb.portfolio.entities.Data;
import com.jcmb.portfolio.service.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class DataRestController {

    private DataService dataService;
    public DataRestController(DataService dataService){
        this.dataService = dataService;
    }

    @GetMapping("/data")
    public List<Data> getData(){
        return dataService.findAll();
    }
}
