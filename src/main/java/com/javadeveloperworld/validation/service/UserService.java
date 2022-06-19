package com.javadeveloperworld.validation.service;

import com.javadeveloperworld.validation.dto.UserRequest;
import com.javadeveloperworld.validation.entity.User;
import com.javadeveloperworld.validation.exception.UserNotFoundException;
import com.javadeveloperworld.validation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(UserRequest userRequest) {
        User user = User.build(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(),
                userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());


        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User getUser(int id) throws UserNotFoundException {
        User user=repository.findByUserId(id);
        if(user!=null){
            return user;
        }else{
            throw new UserNotFoundException("User not found with id provided :"+id);
        }

    }
}
