package com.example.demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

	// @Autowired
	// private StudentRepository userRepository;

//	@PostMapping(path = "/add")
//	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
//		Student n = new Student();
//		n.setName(name);
//		n.setEmail(email);
//		userRepository.save(n);
//		return "Saved";
//	}

//	@GetMapping(path = "/all")
//	public @ResponseBody Iterable<Student> getAllUsers() {
//		return userRepository.findAll();
//	}

	@GetMapping(path = "/get/{id}")
	public Student get(@PathVariable("id") int id) {
		Student s = new Student();
		s.setId(id);
		s.setEmail("kimi.qian.min@gmail.com");
		s.setName("Kimi");
		s.setServerIp(getServerIp());
		return s;
	}

	public String getServerIp() {
		String value = "";
		try {
			InetAddress ip = InetAddress.getLocalHost();
			value = ip.getHostAddress();
			System.out.println("Current IP address : " + value);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return value;
	}

}