package com.example.timeCatcher;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showLogin(
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "idCode", required = false) String idCode,
            Model model
    ) {
        model.addAttribute("name", name);
        model.addAttribute("idCode", idCode);
        return "login";
    }

    @GetMapping("/home")
    public String showHome(
            @RequestParam(name = "startTime", required = false) Date startTime,
            @RequestParam(name = "finishTime", required = false) Date finishTime,
            @RequestParam(name = "textWhere", required = false) String textWhere,
            @RequestParam(name = "textDescription", required = false) String textDescription,
            Model model
    ){
        model.addAttribute("startTime", startTime);
        model.addAttribute("finishTime", finishTime);
        model.addAttribute("textWhere", textWhere);
        model.addAttribute("textDescription", textDescription);
        return "home";
    }

    @GetMapping("/companyHome")
    public String showCompanyHome(
    ){
        return "companyHome";
    }
}


