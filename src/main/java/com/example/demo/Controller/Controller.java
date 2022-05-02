package com.example.demo.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/example")
public class Controller {
	
	@Autowired
	private UserService us;
	
	//pathVariable
	@GetMapping("/{nombre}/{apellino}")
	public List<User> getUser(@PathVariable String nombre,@PathVariable String apellino) {
		
		return us.getUsers(nombre, apellino);
	}

	@GetMapping("/params")
	public List<User> getUserParams(@PathParam(value = "nombre") String nombre,
									@PathParam(value = "apellido")String apellido) {
		
		return us.getUsers(nombre, apellido);
	}
}
