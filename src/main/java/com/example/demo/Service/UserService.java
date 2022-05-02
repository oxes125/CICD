package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;

@Service
public class UserService {
	
	private List<User> lista = new ArrayList<>();
	
	@PostConstruct
	public void full() {
		lista.add(new User("Gabriel","Cortez",23));
		lista.add(new User("Ramiro","x",23));
		lista.add(new User("J","Y",23));
	}
	
	public List<User> getUsers(String name, String apellido) {
		
		return lista.stream().filter(x-> x.getNombre().equals(name) && x.getApellido().equals(apellido) ).collect(Collectors.toList());
	}

	
}
