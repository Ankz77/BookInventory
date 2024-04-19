package com.Ankunda.Inventory.bookInventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.Ankunda.Inventory.bookInventory.service.BookService;
import com.Ankunda.Inventory.bookInventory.service.bookListService;
import com.Ankunda.Inventory.bookInventory.entity.Book;
import com.Ankunda.Inventory.bookInventory.entity.BookList;

import java.util.*;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @Autowired
    private bookListService bookListService;

    @GetMapping("/")
    public String home(){

        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister(){

        return "bookRegister";
    }

    @GetMapping("/available_books")
    public ModelAndView getAllBook(){
        List<Book>list=service.getAllBook();
//        ModelAndView m = new ModelAndView();
//        m.setViewName('bookList');
//        m.addAllObjects("book",list);
        return new ModelAndView("bookList","book",list);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b){
        service.save(b);
        return "redirect: available_books";
    }
    @GetMapping("/my_books")
    public String getMyBooks(Model model){
        List<BookList>list=BookService.getAllMyBooks();
        model.addAttribute("book", list);
        return "myBooks";
    }
    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id){
        Book b=service.getBookById(id);
        BookList mb=new BookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
        com.Ankunda.Inventory.bookInventory.service.bookListService myBookService = new bookListService();
        myBookService.saveMyBooks();
        return "redirect:/my_books";
    }
    @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") int id, Model model){
        service.getBookById(id);
        return "redirect:/bookEdit";
    }
    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id")int id){
        service.deleteById(id);
        return "redirect:/available_books";
    }
}
