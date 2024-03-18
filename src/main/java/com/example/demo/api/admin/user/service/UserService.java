package com.example.demo.api.admin.user.service;

import com.example.demo.api.admin.user.model.QUser;
import com.example.demo.api.admin.user.model.User;
import com.example.demo.api.admin.user.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	public List<User> findALl(){

		QUser user = QUser.user;
		return repository.findAll();
//			User c = queryFactory.selectFrom(user)
//					.where(user.login.eq("David"))
//					.fetchOne();
	}
}
