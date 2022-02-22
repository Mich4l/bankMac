package com.macbank.bankMac.repository;

import com.macbank.bankMac.model.UserEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepo extends ReactiveMongoRepository<UserEntity, String> {

    UserEntity findByUsername(String username);

}
