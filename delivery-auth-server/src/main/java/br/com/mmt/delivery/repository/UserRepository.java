package br.com.mmt.delivery.repository;

import br.com.mmt.delivery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    @Query("SELECT u FROM User u WHERE LOWER (u.username) = LOWER(:username)")
    Optional<User> findByUsernama(@Param("username") String username);
}
