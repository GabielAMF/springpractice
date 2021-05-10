package com.gabriel.cursojava.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.gabriel.cursojava.domain.Cliente;
import com.gabriel.cursojava.repositories.ClienteRepository;
import com.gabriel.cursojava.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepo;
	
	public Cliente buscar(Integer id)  {
		Optional<Cliente> obj = clienteRepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
