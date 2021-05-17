package de.juli.workbench.usermodel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.juli.workbench.usermodel.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
