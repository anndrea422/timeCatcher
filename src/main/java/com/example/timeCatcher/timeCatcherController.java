package com.example.timeCatcher;
import com.example.timeCatcher.completedWork;
import com.example.timeCatcher.timeCatcherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class timeCatcherController {
    @Autowired
    private timeCatcherRepository eRepo;

    @GetMapping("/")
    public ModelAndView showLoginPage(){
        ModelAndView mav = new ModelAndView("login");
        return mav;
    }

    @GetMapping("/list")
    public ModelAndView getAllCompletedWork(){
        ModelAndView mav = new ModelAndView("list-completed-work");
        mav.addObject("completedWork", eRepo.findAll());
        return mav;
    }

    @GetMapping("/add-working-hour-form")
    public ModelAndView addWorkingHour() {
        ModelAndView mav = new ModelAndView("add-working-hour-form");
        completedWork newCompletedWork = new completedWork();
        mav.addObject("newCompletedWork", newCompletedWork);
        return mav;
    }

    @PostMapping("/add-working-hour-form")
    public String saveNewWork(@ModelAttribute completedWork completedWork){
        eRepo.save(completedWork);
        return "redirect:/list";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Long completedWorkId){
        ModelAndView mav = new ModelAndView("add-working-hour-form");
        completedWork newCompletedWork = eRepo.findById(completedWorkId).get();
        mav.addObject("newCompletedWork", newCompletedWork);
        return mav;
    }

    @GetMapping("/deleteWork")
    public String deleteWork(@RequestParam Long completedWorkId) {
        eRepo.deleteById(completedWorkId);
        return "redirect:/list";
    }
}
