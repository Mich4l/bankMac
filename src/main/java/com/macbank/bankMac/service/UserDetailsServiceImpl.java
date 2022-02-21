package com.macbank.bankMac.service;

import com.macbank.bankMac.model.ReadUserResponse;
import com.macbank.bankMac.model.UserEntity;
import com.macbank.bankMac.repository.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepo userRepo;

    public UserDetailsServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username);
    }

    public ReadUserResponse readUserResponse(Long id) {
        Optional<UserEntity> userEntity = userRepo.findById(id);

        if(userEntity.isPresent()) {
            ReadUserResponse readUserResponse = new ReadUserResponse();
            readUserResponse.setId(id);
            readUserResponse.setUsername(userEntity.get().getUsername());
            readUserResponse.setBalance(userEntity.get().getBalance());

            return readUserResponse;
        } else {
            throw new NoSuchElementException("Nie ma takiego Użytkownika");
        }
    }

}
