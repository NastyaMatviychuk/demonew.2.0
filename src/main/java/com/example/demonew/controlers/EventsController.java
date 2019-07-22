package com.example.demonew.controlers;

import com.example.demonew.dao.MeetingDAO;
import com.example.demonew.dao.UserDAO;
import com.example.demonew.repository.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class EventsController {
    @Autowired
    private MeetingDAO meetingDAO;
    @GetMapping("/event")
    public String eventpage(Model model) {
        List<Meeting> meeting1 = meetingDAO.findAllById(0);
        model.addAttribute("meeting1", meeting1);
        List<Meeting> meeting2 = meetingDAO.findAllById(1);
        model.addAttribute("meeting2", meeting2);
        List<Meeting> meeting3 = meetingDAO.findAllById(2);
        model.addAttribute("meeting3", meeting3);
        List<Meeting> meeting4 = meetingDAO.findAllById(3);
        model.addAttribute("meeting4", meeting4);
        List<Meeting> meeting5 = meetingDAO.findAllById(4);
        model.addAttribute("meeting5", meeting5);
        return "eventpage";
    }
    @GetMapping ("/meeting1")
    public String meeting1(Model model) {
        List<Meeting> meeting1 = meetingDAO.findAllById(0);
        model.addAttribute("meeting1", meeting1);
        return "meeting1";
    }
    @GetMapping ("/meeting2")
    public String meeting2(Model model) {
        List<Meeting> meeting2 = meetingDAO.findAllById(1);
        model.addAttribute("meeting2", meeting2);
        return "meeting2";
    }
    @GetMapping ("/meeting3")
    public String meeting3(Model model) {
        List<Meeting> meeting3 = meetingDAO.findAllById(2);
        model.addAttribute("meeting3", meeting3);
        return "meeting3";
    }
    @GetMapping ("/meeting4")
    public String meeting4(Model model) {
        List<Meeting> meeting4 = meetingDAO.findAllById(3);
        model.addAttribute("meeting4", meeting4);
        return "meeting4";
    }
    @GetMapping ("/meeting5")
    public String meeting5(Model model) {
        List<Meeting> meeting5 = meetingDAO.findAllById(4);
        model.addAttribute("meeting5", meeting5);
        return "meeting5";
    }
}
