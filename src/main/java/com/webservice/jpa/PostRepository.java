package com.webservice.jpa;


import com.webservice.modal.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nawaz
 */
public interface PostRepository extends JpaRepository<Post, Integer> {

}
