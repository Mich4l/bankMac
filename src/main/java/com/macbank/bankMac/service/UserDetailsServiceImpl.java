package com.macbank.bankMac.service;

import com.macbank.bankMac.model.ReadUserResponse;
import com.macbank.bankMac.model.UserEntity;
import com.macbank.bankMac.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.NoSuchElementException;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    public UserDetailsServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username);
    }

    public Mono<ReadUserResponse> readUserResponse(String id) {
//        Mono<UserEntity> userEntity = userRepo.findById(id);
//
//
//            ReadUserResponse readUserResponse = new ReadUserResponse();
//            readUserResponse.setId(id);
//            readUserResponse.setUsername();
//            readUserResponse.setBalance();
//
//            return readUserResponse;
//         else {
//            throw new NoSuchElementException("Nie ma takiego Użytkownika");
//        }
    return null;
    }

}
