package com.library.management.LibraryManagement.repository;

import com.library.management.LibraryManagement.security.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserClient, String> {
}
