package com.example.timeCatcher;

import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;

        import java.util.ArrayList;
        import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//-------------- REGISTER NEW EMPLOYEE ------------

    @GetMapping("/register")
    public String showRegistration() {
        return "register";
    }

    @PostMapping("/register")
    public String createUser(@ModelAttribute User user) {
        User user1 = userService.createUser(user);
        return "login2";

    }

    @GetMapping({"/login2"})
    public String showLogin(@PathVariable Integer id, Model model) {
        model.addAttribute("user", userRepository.findById(id).orElseThrow());
        return "login2";}




//-------------- LOGIN ---------------



   @GetMapping("/{id}")
    public String insertedUser(@PathVariable @RequestParam(value = "id") Integer id, Model model) {
        model.addAttribute("id", userRepository.findById(id).orElseThrow(new UserNotFoundException()));
        return "home";

    }

// ------------- GET ALL USERS, SEARCH USERS-----------------------

    @GetMapping("/users")
    public String showAllUsers(@RequestParam(required = false) String search,
                               @RequestParam(required = false) String searchBy,
                               Model model) {
        List<User> foundUsers = new ArrayList<>();

        if (search != null && !search.isEmpty()) {
            switch (searchBy) {
                case "name":
                    foundUsers = userRepository.findAllByNameContaining(search);
                    break;
                case "id":
                    foundUsers = userRepository.findAllById(search);
                    break;
            }
        }

        if (foundUsers.isEmpty()) {
            foundUsers = userRepository.findAll();}
        model.addAttribute("userList", foundUsers);
        model.addAttribute("searchText", search != null ? search : "");
        return "users";


    }

//------------- VIEW USER --------------

    @GetMapping("/user/view/{id}")
    public String showUser(@PathVariable Integer id, Model model) {
        model.addAttribute("user", userRepository.findById(id).orElseThrow());
        return "viewUser";
    }

//----------- UPDATE USER ---------------

    @GetMapping("/user/update/{id}")
    public String showUpdateUser(@PathVariable Integer id, Model model) {
        model.addAttribute("user", userRepository.findById(id).orElseThrow());
        return "updateUser";
    }

    @PostMapping("/user/update/{id}")
    public String updateUser(@PathVariable Integer id, User user) {
        User userToSave = userRepository.findById(id).orElseThrow();
        userToSave.setName(user.getName());
        userRepository.save(userToSave);

        return "redirect:/user/view/{id}";
    }

//------------ DELETE USER----------------


    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
        return "redirect:/users";
    }








}
