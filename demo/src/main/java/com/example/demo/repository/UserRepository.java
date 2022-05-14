package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);

    @Query(value = "SELECT * FROM user WHERE password='eya'", nativeQuery = true)
    Collection<User> findUsersWherePasswordIsEya();

    @Modifying
    @Query(value = "UPDATE User u set u.email = :email WHERE u.id = :id")
    @Transactional
    void updateEmail(@Param(value = "id") int id, @Param(value = "email") String email);
}
