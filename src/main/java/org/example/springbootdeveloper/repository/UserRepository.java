package org.example.springbootdeveloper.repository;

import org.example.springbootdeveloper.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    //email로 사용자의 정보를 가져옴
}
