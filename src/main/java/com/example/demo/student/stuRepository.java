package com.example.demo.student;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface stuRepository extends MongoRepository<stu, Long> {
    
    
}
