package com.kubernates.UserManagement.repository;

import com.kubernates.UserManagement.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
