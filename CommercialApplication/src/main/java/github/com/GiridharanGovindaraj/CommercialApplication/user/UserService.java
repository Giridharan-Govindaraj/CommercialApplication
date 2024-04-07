package github.com.GiridharanGovindaraj.CommercialApplication.user;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	private final UserRepository userrepo;	
	
	public UserService(UserRepository userrepo) {
		super();
		this.userrepo = userrepo;
	}


	
	@Transactional
	public void createUser(Users user) {
		
		userrepo.save(user);
	}
	
	@Transactional
	public  List<Users> getUsers() {
		return userrepo.findAll();
	}
	
	@Transactional
	public  Users getUserbyUserid(long id) throws Exception {
		Optional<Users> out = userrepo.findById(id);
		
		if (!out.isPresent()) {
			throw new Exception("User not found");
		}
		
		return out.get();
				
	}

	
	@Transactional
	public  Users getUserbyUserName(String username) throws Exception {
		Optional<Users> out = userrepo.findByUserName(username );
		
		if (!out.isPresent()) {
			throw new Exception("User not found");
		}
		
		return out.get();
				
	}
	
	@Transactional
	public  Users getUserbyemail(String email) throws Exception {
		Optional<Users> out = userrepo.findByEmail(email);
		
		if (!out.isPresent()) {
			throw new Exception("User not found");
		}
		
		return out.get();
				
	}


	@Transactional
	public void deleteUsers() {
		
		userrepo.deleteAll();
		// TODO Auto-generated method stub
		
	}


	@Transactional
	public void deleteUserByID(long id) {
		// TODO Auto-generated method stub
		userrepo.deleteById(id);
		
	}



	



	public Users ModifyUser(Users user) throws Exception {
		// TODO Auto-generated method stub
		Optional<Users> useroutput = userrepo.findByUserName(user.getUserName());
		
		if(useroutput.isPresent()) {
			
			Users userfinal = useroutput.get();
			
			userfinal.setCountry(user.getCountry());
			userfinal.setCountryCode(user.getCountryCode());
			userfinal.setEmail(user.getEmail());
			userfinal.setPassword(user.getPassword());
			userfinal.setRole(user.getRole());
			return userrepo.save(userfinal);
			
		}
		
		throw new Exception("User not found for modify");
		
		
	}

	
	
	
	
	
	
	
	
	

}
