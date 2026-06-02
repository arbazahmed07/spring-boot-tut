package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class stuService {
    private final stuRepository stuRepository;

    public stuService(stuRepository stuRepository) {
        this.stuRepository = stuRepository;
    }

    public List<stu> getStudents() {
		return stuRepository.findAll();
	}
	   public stu addStudent(stu student) {
        return stuRepository.save(student);
    }
}
