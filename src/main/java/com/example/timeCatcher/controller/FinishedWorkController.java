package com.example.timeCatcher.controller;

import com.example.timeCatcher.repository.FinishedWorkRepository;
import com.example.timeCatcher.model.FinishedWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FinishedWorkController {
    @Autowired
    private FinishedWorkRepository finishedWorkRepository;


    @GetMapping({"/showFinishedWorks", "/", "/list"})
    public ModelAndView showFinishedWorks() {
        ModelAndView mav = new ModelAndView("list-finishedWorks");
        List<FinishedWork> list = finishedWorkRepository.findAll();
        mav.addObject("finishedWorks", list);
        return mav;
    }

    @GetMapping("addFinishedWorkForm")
    public ModelAndView addEmployeeForm(){
        ModelAndView mav = new ModelAndView("add-finishedWork-form");
        FinishedWork newFinishedWork = new FinishedWork();
        mav.addObject("finishedWork", newFinishedWork);
        return mav;
    }

    @PostMapping(value = "/saveFinishedWork")
    public String saveEmployee(@ModelAttribute (value = "finishedWork") FinishedWork finishedWork ) {
        finishedWorkRepository.save(finishedWork);
        return "redirect:/list";
    }
}
