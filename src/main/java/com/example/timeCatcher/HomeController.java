package com.example.timeCatcher;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {

    @GetMapping("/")
    public String showLogin(
            @RequestParam(name = "id", required = false) Integer id,
           // @RequestParam(name = "idCode", required = false) String idCode,
            Model model
    ) {
        model.addAttribute("id", id);
       // model.addAttribute("idCode", idCode);
        return "login";
    }

    @GetMapping("/home")
    public String showHome(
            @RequestParam(name = "date", required = false) String date,
            @RequestParam(name = "startTime", required = false) String startTime,
            @RequestParam(name = "finishTime", required = false) String finishTime,
            @RequestParam(name = "location", required = false) String location,
            @RequestParam(name = "workDescription", required = false) String workDescription,
            Model model
    ){
        model.addAttribute("date", date);
        model.addAttribute("startTime", startTime);
        model.addAttribute("finishTime", finishTime);
        model.addAttribute("location", location);
        model.addAttribute("workDescription", workDescription);
        return "home";
    }

    @GetMapping("/companyHome")
    public String showCompanyHome(
    ){
        return "companyHome";
    }


}


