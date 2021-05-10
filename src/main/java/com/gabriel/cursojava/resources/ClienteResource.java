package com.gabriel.cursojava.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.cursojava.domain.Cliente;
import com.gabriel.cursojava.services.ClienteService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService clienteServ;
	
	@RequestMapping(value= "/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException {
		Cliente obj = clienteServ.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}
