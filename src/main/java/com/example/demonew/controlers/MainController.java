package com.example.demonew.controlers;

import com.example.demonew.dao.BookDAO;
import com.example.demonew.dao.MeetingDAO;
import com.example.demonew.dao.NewsDAO;
import com.example.demonew.dao.UserDAO;
import com.example.demonew.repository.Book;
import com.example.demonew.repository.Meeting;
import com.example.demonew.repository.News;
import com.example.demonew.repository.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private UserDAO userDAO;

    @GetMapping ("/register")
    public String register(Model model) {

        return "register";
    }

    @PostMapping(path="/register") // Map ONLY GET Requests
    public @ResponseBody
    String addNewUser (@RequestParam String name, @RequestParam String surname,
           @RequestParam String username ,
                       @RequestParam String password,
                       @RequestParam String email,
                       @RequestParam String birthday,
                       @RequestParam String phone,
                       @RequestParam String street,
                       @RequestParam String house,
                       @RequestParam int flat) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User();
        n.setName(name);
        n.setSurname(surname);
        n.setUsername(username);
        n.setPassword(password);
        n.setEmail(email);
        n.setBirthday(birthday);
        n.setPhone(phone);
        n.setStreet(street);
        n.setHouse(house);
        n.setFlat(flat);
        userDAO.save(n);
        return "Saved";
    }
    }
