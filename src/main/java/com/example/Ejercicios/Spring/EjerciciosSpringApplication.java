package com.example.Ejercicios.Spring;

import com.example.Ejercicios.Spring.entities.Laptop;
import com.example.Ejercicios.Spring.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjerciciosSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjerciciosSpringApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop Laptop1 = new Laptop(null, "model1", "Lenovo", "Intel Core 5", "Pink", 250000.00);
		Laptop Laptop2 = new Laptop(null, "Legion 5 pro", "Lenovo", "Ryzen 7 5600", "Grey", 515000.00);
		Laptop Laptop3 = new Laptop(null, "model3", "Lenovo2", "Intel Core 3", "Black", 385000.00);

		repository.save(Laptop1);
		repository.save(Laptop2);
		repository.save(Laptop3);

	}
}
