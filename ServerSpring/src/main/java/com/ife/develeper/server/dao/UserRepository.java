package com.ife.develeper.server.dao;

import com.ife.develeper.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserLogin(String userLogin);
}
