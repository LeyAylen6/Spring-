package com.example.Ejercicios.Spring.controller;


import com.example.Ejercicios.Spring.entities.Laptop;
import com.example.Ejercicios.Spring.repository.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    LaptopRepository LaptopRepository;

    public LaptopController(LaptopRepository LaptopRepository) {
        this.LaptopRepository = LaptopRepository;
    }

    @GetMapping("/api/laptop")
    public List<Laptop> laptopsList(Laptop laptop) {
        return LaptopRepository.findAll();
    }

    @PutMapping("/api/laptop")
    public Laptop saveLaptop(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers) { //que significan los @@ esos????????
        return LaptopRepository.save(laptop);
    }
}
