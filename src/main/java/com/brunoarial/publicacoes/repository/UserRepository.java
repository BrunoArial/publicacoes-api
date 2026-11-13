package com.brunoarial.publicacoes.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.brunoarial.publicacoes.domain.User;

@Repository 
public interface UserRepository extends MongoRepository<User, String> {
    
}
