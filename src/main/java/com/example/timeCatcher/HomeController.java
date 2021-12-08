package com.example.timeCatcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class HomeController {
//    private final FinishedWorkRepository finishedWorkRepository;
//
//    @Autowired
//    HomeController(FinishedWorkRepository finishedWorkRepository) {this.finishedWorkRepository = finishedWorkRepository;}

//    @GetMapping("/")
//    public String showLogin(
//            @RequestParam(name = "name", required = false) String name,
//            @RequestParam(name = "idCode", required = false) String idCode,
//            Model model
//    ) {
//        model.addAttribute("name", name);
//        model.addAttribute("idCode", idCode);
//        return "login";
//    }
//
//    @GetMapping("/home")
//    public String showHome(
//            @RequestParam(name = "date", required = false) String date,
//            @RequestParam(name = "startTime", required = false) String startTime,
//            @RequestParam(name = "finishTime", required = false) String finishTime,
//            @RequestParam(name = "location", required = false) String location,
//            @RequestParam(name = "workDescription", required = false) String workDescription,
//            Model model
//    ){
//        model.addAttribute("date", date);
//        model.addAttribute("startTime", startTime);
//        model.addAttribute("finishTime", finishTime);
//        model.addAttribute("location", location);
//        model.addAttribute("workDescription", workDescription);
//        return "home";
//    }

//    @GetMapping("/home")
//
//    @PostMapping("/home/update/{id}")
//    public String updateFinishedWork(@PathVariable Long id, FinishedWork finishedWork){
//        FinishedWork workToSave = finishedWorkRepository.findById(id).orElseThrow();
//        workToSave.setDate(finishedWork.getDate());
//        finishedWorkRepository.save(workToSave);
//
//        return "/home" + finishedWork.getId();
//
//    }
//
//
//
//
//
//    @GetMapping("/companyHome")
//    public String showCompanyHome(
//    ){
//        return "companyHome";
//    }
}


