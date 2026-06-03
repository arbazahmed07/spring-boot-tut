package com.example.demo.student;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface stuRepository extends MongoRepository<stu, Long> {

        Optional<stu> findByEmail(String email);

    
}
