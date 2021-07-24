package br.com.mmt.delivery.repository;

import br.com.mmt.delivery.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthrorityRepository extends JpaRepository<Authority, String > {
    Authority findByName(String name);
}
