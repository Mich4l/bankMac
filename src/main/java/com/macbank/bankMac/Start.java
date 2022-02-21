package com.macbank.bankMac;

import com.macbank.bankMac.model.UserEntity;
import com.macbank.bankMac.repository.UserRepo;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class Start {

    public Start(UserRepo userRepo, PasswordEncoder passwordEncoder) {

        UserEntity userEntityMichal = new UserEntity();
        userEntityMichal.setUsername("michal");
        userEntityMichal.setPassword(passwordEncoder.encode("haslo123"));
        userEntityMichal.setBalance(3.53);
        userEntityMichal.setRole("ROLE_USER");
        userRepo.save(userEntityMichal);

        UserEntity userEntityZbyszek = new UserEntity();
        userEntityZbyszek.setUsername("zbyszek");
        userEntityZbyszek.setPassword(passwordEncoder.encode("zbyszek123"));
        userEntityZbyszek.setBalance(4213.14);
        userEntityZbyszek.setRole("ROLE_ADMIN");
        userRepo.save(userEntityZbyszek);

        UserEntity userEntityAdam = new UserEntity();
        userEntityAdam.setUsername("adam");
        userEntityAdam.setPassword(passwordEncoder.encode("adam123"));
        userEntityAdam.setBalance(4213.14);
        userEntityAdam.setRole("ROLE_USER");
        userRepo.save(userEntityAdam);

        UserEntity userEntityWojtek = new UserEntity();
        userEntityWojtek.setUsername("wojtek");
        userEntityWojtek.setPassword(passwordEncoder.encode("wojtek123"));
        userEntityWojtek.setBalance(4213.14);
        userEntityWojtek.setRole("ROLE_ADMIN");
        userRepo.save(userEntityWojtek);

        UserEntity userEntityAnna = new UserEntity();
        userEntityAnna.setUsername("anna");
        userEntityAnna.setPassword(passwordEncoder.encode("anna123"));
        userEntityAnna.setBalance(4213.14);
        userEntityAnna.setRole("ROLE_USER");
        userRepo.save(userEntityAnna);

        UserEntity userEntityMagda = new UserEntity();
        userEntityMagda.setUsername("magda");
        userEntityMagda.setPassword(passwordEncoder.encode("magda123"));
        userEntityMagda.setBalance(4213.14);
        userEntityMagda.setRole("ROLE_ADMIN");
        userRepo.save(userEntityMagda);

    }

}
