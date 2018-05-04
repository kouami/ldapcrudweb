package com.example.ldapcrudweb.web;

import com.example.ldapcrudweb.data.domain.Person;
import com.example.ldapcrudweb.data.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentManagementController {

    @Autowired
    private PersonRepository personRepository;

    //@Secured(value={"Admin","User"})
    @RequestMapping("/list")
    public ModelAndView getStudentList() {
        List<Person> students = personRepository.findAll();
        System.out.println(students);
        ModelAndView studentListView = new ModelAndView("list");
        studentListView.addObject("students", students);
        return studentListView;
    }
}
