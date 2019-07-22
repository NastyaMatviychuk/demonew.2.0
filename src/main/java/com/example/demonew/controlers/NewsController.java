package com.example.demonew.controlers;

import com.example.demonew.dao.NewsDAO;
import com.example.demonew.repository.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class NewsController {
    @Autowired
    private NewsDAO newsDAO;
    @GetMapping("/news")
    public String newstpage(Model model) {
        List<News> news1 = newsDAO.findById(0);
        model.addAttribute("news1",news1);
        List<News> news2 = newsDAO.findById(1);
        model.addAttribute("news2",news2);
        List<News> news3 = newsDAO.findById(2);
        model.addAttribute("news3",news3);
        List<News> news4 = newsDAO.findById(3);
        model.addAttribute("news4",news4);
        List<News> news5 = newsDAO.findById(4);
        model.addAttribute("news5",news5);
        return "newspage";
    }
    @GetMapping ("/news1")
    public String news1(Model model) {
        List<News> news1 = newsDAO.findById(0);
        model.addAttribute("news1", news1);
        return "news1";
    }
    @GetMapping ("/news2")
    public String news2(Model model) {
        List<News> news2 = newsDAO.findById(1);
        model.addAttribute("news2", news2);
        return "news2";
    }
    @GetMapping ("/news3")
    public String news3(Model model) {
        List<News> news3 = newsDAO.findById(2);
        model.addAttribute("news3", news3);
        return "news3";
    }
    @GetMapping ("/news4")
    public String news4(Model model) {
        List<News> news4 = newsDAO.findById(3);
        model.addAttribute("news4", news4);
        return "news4";
    }
    @GetMapping ("/news5")
    public String news5(Model model) {
        List<News> news5 = newsDAO.findById(4);
        model.addAttribute("news5", news5);
        return "news5";
    }
}
