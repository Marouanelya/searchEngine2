package com.polytech.repository;

import com.polytech.business.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by E.Marouane on 06/04/2017.
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {

}
