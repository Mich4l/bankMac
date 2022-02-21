package com.macbank.bankMac;

import com.macbank.bankMac.model.UserEntity;
import com.macbank.bankMac.repository.UserRepo;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class Start {

    public Start(UserRepo userRepo, PasswordEncoder passwordEncoder) {

        UserEntity userEntity = new UserEntity();
        userEntity.setUsername("michal");
        userEntity.setPassword(passwordEncoder.encode("haslo123"));
        userEntity.setBalance(3.53);
        userEntity.setRole("ROLE_USER");
        userRepo.save(userEntity);

        UserEntity userEntity1 = new UserEntity();
        userEntity1.setUsername("zbychu");
        userEntity1.setPassword(passwordEncoder.encode("zbychu123"));
        userEntity1.setBalance(4213.14);
        userEntity1.setRole("ROLE_ADMIN");
        userRepo.save(userEntity1);
    }

}
