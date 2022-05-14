package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>  {
    User findByEmail(String email);

    @Query(value = "SELECT * FROM user WHERE password='eya'",nativeQuery = true)
    Collection<User> findUsersWherePasswordIsEya();
}
