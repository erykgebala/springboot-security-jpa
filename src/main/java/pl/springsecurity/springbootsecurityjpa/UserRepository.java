package pl.springsecurity.springbootsecurityjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.springsecurity.springbootsecurityjpa.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUserName(String userName);
}
