package com.example.demonew.controlers;

import com.example.demonew.dao.BookDAO;
import com.example.demonew.repository.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookDAO bookDAO;
    @GetMapping("/")
    public String page1(Model model) {
        List<Book> book1 = bookDAO.findAllById(0);
        model.addAttribute("book1", book1);
        List<Book> book2 = bookDAO.findAllById(1);
        model.addAttribute("book2", book2);
        List<Book> book3 = bookDAO.findAllById(2);
        model.addAttribute("book3", book3);
        List<Book> book4 = bookDAO.findAllById(3);
        model.addAttribute("book4", book4);
        List<Book> book5 = bookDAO.findAllById(4);
        model.addAttribute("book5", book5);
        List<Book> book6 = bookDAO.findAllById(5);
        model.addAttribute("book6", book6);
        List<Book> book7 = bookDAO.findAllById(6);
        model.addAttribute("book7", book7);
        List<Book> book8 = bookDAO.findAllById(7);
        model.addAttribute("book8", book8);
        return "index";
    }
    @GetMapping ( "/page2")
    public String page2(Model model) {
        List<Book> book9 = bookDAO.findAllById(8);
        model.addAttribute("book9", book9);
        List<Book> book10 = bookDAO.findAllById(9);
        model.addAttribute("book10", book10);
        List<Book> book11 = bookDAO.findAllById(10);
        model.addAttribute("book11", book11);
        List<Book> book12 = bookDAO.findAllById(11);
        model.addAttribute("book12", book12);
        List<Book> book13 = bookDAO.findAllById(12);
        model.addAttribute("book13", book13);
        List<Book> book14 = bookDAO.findAllById(13);
        model.addAttribute("book14", book14);
        List<Book> book15 = bookDAO.findAllById(14);
        model.addAttribute("book15", book15);
        List<Book> book16 = bookDAO.findAllById(15);
        model.addAttribute("book16", book16);
        return "indexpage2";
    }
    @GetMapping ("/book1")
    public String book1(Model model) {
        List<Book> book1 = bookDAO.findAllById(0);
        model.addAttribute("book1", book1);
        return "book1";
    }
    @GetMapping ("/book2")
    public String book2(Model model) {
        List<Book> book2 = bookDAO.findAllById(1);
        model.addAttribute("book2", book2);
        return "book2";
    }
    @GetMapping ("/book3")
    public String book3(Model model) {
        List<Book> book3 = bookDAO.findAllById(2);
        model.addAttribute("book3", book3);
        return "book3";
    }
    @GetMapping ("/book4")
    public String book4(Model model) {
        List<Book> book4 = bookDAO.findAllById(3);
        model.addAttribute("book4", book4);
        return "book4";
    }
    @GetMapping ("/book5")
    public String book5(Model model) {
        List<Book> book5 = bookDAO.findAllById(4);
        model.addAttribute("book5", book5);
        return "book5";
    }
    @GetMapping ("/book6")
    public String book6(Model model) {
        List<Book> book6 = bookDAO.findAllById(5);
        model.addAttribute("book6", book6);
        return "book6";
    }
    @GetMapping ("/book7")
    public String book7(Model model) {
        List<Book> book7 = bookDAO.findAllById(6);
        model.addAttribute("book7", book7);
        return "book7";
    }
    @GetMapping ("/book8")
    public String book8(Model model) {
        List<Book> book8 = bookDAO.findAllById(7);
        model.addAttribute("book8", book8);
        return "book8";
    }
    @GetMapping ("/book9")
    public String book9(Model model) {
        List<Book> book9 = bookDAO.findAllById(8);
        model.addAttribute("book9", book9);
        return "book9";
    }
    @GetMapping ("/book10")
    public String book10(Model model) {
        List<Book> book10 = bookDAO.findAllById(9);
        model.addAttribute("book10", book10);
        return "book10";
    }
    @GetMapping ("/book11")
    public String book11(Model model) {
        List<Book> book11 = bookDAO.findAllById(10);
        model.addAttribute("book11", book11);
        return "book11";
    }
    @GetMapping ("/book12")
    public String book12(Model model) {
        List<Book> book12 = bookDAO.findAllById(11);
        model.addAttribute("book12", book12);
        return "book12";
    }
    @GetMapping ("/book13")
    public String book13(Model model) {
        List<Book> book13 = bookDAO.findAllById(12);
        model.addAttribute("book13", book13);
        return "book13";
    }
    @GetMapping ("/book14")
    public String book14(Model model) {
        List<Book> book14 = bookDAO.findAllById(13);
        model.addAttribute("book14", book14);
        return "book14";
    }
    @GetMapping ("/book15")
    public String book15(Model model) {
        List<Book> book15 = bookDAO.findAllById(14);
        model.addAttribute("book15", book15);
        return "book15";
    }
    @GetMapping ("/book16")
    public String book16(Model model) {
        List<Book> book16 = bookDAO.findAllById(15);
        model.addAttribute("book16", book16);
        return "book16";
    }


}
