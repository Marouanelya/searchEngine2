package com.polytech.repository;

import com.polytech.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by E.Marouane on 06/04/2017.
 */
@Repository
public interface UserRepository extends JpaRepository<Users, String> {

}
