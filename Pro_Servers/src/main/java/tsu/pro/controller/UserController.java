package tsu.pro.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tsu.pro.bean.User;
import tsu.pro.bean.userInfo;
import tsu.pro.mapper.UserMapper;
import tsu.pro.service.UserService;


@RestController
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private UserMapper userMapper;
	static Map<String, User> users = Collections.synchronizedMap(new HashMap<String, User>());


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public userInfo<User> getUserList() {
		

		return userService.userList();
	}


	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String createUser(@ModelAttribute User user) {
	 return	userService.insertUser(user);
	

	}


	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public userInfo<User> getUser(@PathVariable int id) {
		return userService.selectByID(id);
	}

	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public userInfo<User>  putUser( @ModelAttribute User user) {
		System.out.println(user.toString());
		return userService.updateUser(user);

	}


	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public userInfo<User> deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}

    @RequestMapping(value="/login/{name}/{password}",method=RequestMethod.POST)
    public userInfo<User> loginUser(@PathVariable("name") String name,@PathVariable String password){
    	System.out.println(name+password);
    	return userService.finduser(name,password);
    }

	@RequestMapping(value = "userrole/{id}", method = RequestMethod.DELETE)
	public userInfo<User> deleteuserrole(@PathVariable int id) {
		return userService.deleteuserrole(id);
	}

}
