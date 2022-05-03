package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@SpringBootTest
class Demo1ApplicationTests {

	@Autowired
	UserService us;
	
	@Test
	void contextLoads() {
		
		List<User> lista = new ArrayList<>();
		
		lista=us.getUsers("Gabriel", "Cortez");
		
		assertEquals(lista.get(0).getApellido(), "asd");
		assertEquals(lista.get(0).getNombre(), "Gabzasdriel");
		
	}

	@Test
	void fail() {
		
		List<User> lista = new ArrayList<>();
		
		lista=us.getUsers("s", "s");
		
		assertEquals(lista.size(), 1);
		
	}
}
