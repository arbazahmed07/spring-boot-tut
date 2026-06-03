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
    public void deleteStudent(Long id) {
        System.out.println("Deleting student with id: " + id);
        stuRepository.deleteById(id);
    }
    public stu updateStudent(Long id, stu updatedStudent) {
        stu existingStudent = stuRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student not found with id: " + id));

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setEmail(updatedStudent.getEmail());
        existingStudent.setDob(updatedStudent.getDob());

        return stuRepository.save(existingStudent);
    }
    public stu registerNewStudent(stu student) {
        // Check if email is already taken
        if (stuRepository.findByEmail(student.getEmail()).isPresent()) {
            throw new IllegalStateException("Email already taken");
        }
        return stuRepository.save(student);
    };
  
}
