package org.xrave.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.xrave.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String username);
}
