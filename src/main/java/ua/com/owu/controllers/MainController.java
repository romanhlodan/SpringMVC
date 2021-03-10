package ua.com.owu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.owu.dao.ClientDAO;
import ua.com.owu.dao.UserDAO;
import ua.com.owu.entity.Client;
import ua.com.owu.entity.User;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ClientDAO clientDAO;

    @Autowired
    private UserDAO userDAO;

    @GetMapping("/")
    public String index(Model model){
        List<User> user = userDAO.findAll();
        model.addAttribute("qqq", user);
        return "index";
    }

}
