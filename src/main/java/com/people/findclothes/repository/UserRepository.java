package com.people.findclothes.repository;

import com.people.findclothes.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
