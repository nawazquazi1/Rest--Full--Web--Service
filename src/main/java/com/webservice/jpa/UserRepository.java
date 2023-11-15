package com.webservice.jpa;


import com.webservice.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nawaz
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
