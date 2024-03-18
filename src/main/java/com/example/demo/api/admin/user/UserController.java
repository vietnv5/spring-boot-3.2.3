package com.example.demo.api.admin.user;

import com.example.demo.api.admin.user.model.User;
import com.example.demo.api.admin.user.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping()
	public List<User> get() {
		return userService.findALl();
	}

}
