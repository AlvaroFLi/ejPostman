package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("")
public class PersonController {

    @PostMapping(value = "/useradd")
    public Persona crear(@RequestBody Persona p){
        return p;
    }



}
