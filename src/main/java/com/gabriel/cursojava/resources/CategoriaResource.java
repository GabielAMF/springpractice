package com.gabriel.cursojava.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.cursojava.domain.Categoria;
import com.gabriel.cursojava.services.CategoriaService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService serv; 
	
	@RequestMapping(value= "/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException {
		Categoria obj = serv.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}

}
