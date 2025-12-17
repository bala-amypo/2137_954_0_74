package com.example.demo.controller;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;

@RestController
@ReqestMapping("/student")
public class Studentctl{
    @Autowired
    private Studentservice ser;

    //POST
    @PostMapping Studententity addStudent(@ReqestBody Studententity st) {
        return ser.saveData(st);
    }
    //GET ALL
    @GetMapping("/getall")
    public Collection<Studententity> getAllStudents() {
        return ser.getAll();
    }
    //GET BY 
}