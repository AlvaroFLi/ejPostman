package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@Getter
@Setter
public class Persona {

    String name;
    String ciudad;
    int edad;
    
    public Persona(String name, String ciudad, int edad ){
        this.name=name;
        this.ciudad=ciudad;
        this.edad=edad+1;
    }

}
