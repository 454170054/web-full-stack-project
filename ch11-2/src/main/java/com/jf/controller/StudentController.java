package com.jf.controller;

import com.jf.pojo.po.Student;
import com.jf.service.impl.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-30 21:14
 */
@Controller
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/studentList")
    public String studentList(Model model){
        List<Student> students = studentService.studentList();
        model.addAttribute("students", students);
        return "studentList";
    }
}
