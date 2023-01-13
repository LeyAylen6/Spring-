package com.example.Ejercicios.Spring.repository;

import com.example.Ejercicios.Spring.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Long> {

}
