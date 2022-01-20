package com.example.demo;


import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("")
public class ejercicopostman {
    @GetMapping("/user/{name}")
    public String getName(@PathVariable(name="name") String nombre){
        String nameToreturn = nombre;
        return "hola " + nameToreturn ;
    }



}



