package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class stuService {
  
    public List<stu> getStudents() {
		return List.of(
			new stu(1L, "John Doe", "john.doe@example.com", LocalDate.now(), 20)
		);
	}
}
