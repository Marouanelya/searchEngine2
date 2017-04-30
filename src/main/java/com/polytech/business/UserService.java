package com.polytech.business;

import com.polytech.business.models.Authority;
import com.polytech.business.models.Users;
import com.polytech.repository.AuthorityRepository;
import com.polytech.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by E.Marouane on 06/04/2017.
 */

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    public UserService(){

    }

    public UserService(UserRepository userRepository, AuthorityRepository authorityRepository){
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
    }

    public void save(Users users) {
        userRepository.save(users);
        authorityRepository.save(new Authority(users.getEmail(), "USER"));
    }

    public List<Users> fetchAll(){
        return userRepository.findAll();
    }

}
