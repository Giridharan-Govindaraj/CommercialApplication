package github.com.GiridharanGovindaraj.CommercialApplication.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Users, Long> {


	Optional<Users> findByUserName(String string);

	Optional<Users> findByEmail(String email);

}