package com.example.timeCatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TimeCatcherController {
    @Autowired
    private TimeCatcherRepository eRepo;

    @GetMapping("/")
    public ModelAndView showLoginPage(){
        ModelAndView mav = new ModelAndView("login");
        return mav;
    }

    @GetMapping("/list/{id}")
    public ModelAndView getAllCompletedWork(@PathVariable("id") Integer id){
        ModelAndView mav = new ModelAndView("list-completed-work");
        List<CompletedWork> userWorks = eRepo.findAllByUserId(id);
        mav.addObject("completedWork",userWorks);
        return mav;
    }

    @GetMapping("/add-working-hour-form")
    public ModelAndView addWorkingHour() {
        ModelAndView mav = new ModelAndView("add-working-hour-form");
        CompletedWork newCompletedWork = new CompletedWork();
        mav.addObject("newCompletedWork", newCompletedWork);
        return mav;
    }

    @PostMapping("/add-working-hour-form")
    public String saveNewWork(@ModelAttribute CompletedWork completedWork){
        eRepo.save(completedWork);
        return "redirect:/list";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Long completedWorkId){
        ModelAndView mav = new ModelAndView("add-working-hour-form");
        CompletedWork newCompletedWork = eRepo.findById(completedWorkId).get();
        mav.addObject("newCompletedWork", newCompletedWork);
        return mav;
    }

    @GetMapping("/deleteWork")
    public String deleteWork(@RequestParam Long completedWorkId) {
        eRepo.deleteById(completedWorkId);
        return "redirect:/list";
    }
}
