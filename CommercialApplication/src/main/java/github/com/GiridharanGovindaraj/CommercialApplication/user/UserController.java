package github.com.GiridharanGovindaraj.CommercialApplication.user;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("users/v1")
public class UserController {
	
	private final UserService userService;
	
	
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}



	@PostMapping
	private void createUser(@RequestBody Users users) {
		
		userService.createUser(users);
	}
	
	
	@GetMapping
	private  List<Users> getAllUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("/{id}")
	private  Users getUserByID(@PathVariable(name = "id") long id) throws Exception {
		return userService.getUserbyUserid(id);
	}
	
	@GetMapping("/{username}/username")
	private  Users getUserByUserName(@PathVariable(name = "username") String username) throws Exception {
		return userService.getUserbyUserName(username);
	}
	
	@GetMapping("/{email}/email")
	private  Users getUserByEmail(@PathVariable(name = "email") String email) throws Exception {
		return userService.getUserbyemail(email);
	}
	
	
	@DeleteMapping
	private void deleteUsers() {
		
		userService.deleteUsers();
	}
	
	@DeleteMapping("/{id}")
	private void deleteUserByID(@PathVariable(name = "id") long id) {
		
		userService.deleteUserByID(id);
	}
	
	@PutMapping
	private Users modifyUser(@RequestBody Users user) throws Exception {
		
		return userService.ModifyUser(user);
	}
	
	
	
	
	

}
