package com.example.demo.student;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/students")
public class stuController {
  private final stuService stuService;
    public stuController(stuService stuService) {
        this.stuService = stuService;
    }

   @GetMapping
    public List<stu> getStudents() {
           return stuService.getStudents();
	}
}
