package com.example.demo.Controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

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
	

	@GetMapping("/{nombre}/{apellino}")
	public List<User> getUser(@PathVariable String nombre,@PathVariable String apellino) throws IOException {
		/*
		File fileName = new File("C:\\Gabriel\\test.txt");
		  
        // Create a Stream of string type
        // using the lines() method to
        // read one line at a time from the text file
        Stream<String> text = Files.lines(fileName.toPath());
  
        // Creating parallel streams using parallel() method
        // later using forEach() to print on console
        text.parallel().forEach(System.out::println);
  
        // Closing the Stream
        // using close() method
        text.close();
        */
        
		return us.getUsers(nombre, apellino);
	}

	@GetMapping("/params")
	public List<User> getUserParams(@PathParam(value = "nombre") String nombre,
									@PathParam(value = "apellido")String apellido) {
		
		return us.getUsers(nombre, apellido);
	}
}
