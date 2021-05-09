package com.gabriel.cursojava;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gabriel.cursojava.domain.Categoria;
import com.gabriel.cursojava.repositories.CategoriaRepository;

@SpringBootApplication
public class CursojavaApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository catRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CursojavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria cat1 = new Categoria(null,"Informatica");
		Categoria cat2 = new Categoria(null,"Escritorio");
		
		
		
		catRepo.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
