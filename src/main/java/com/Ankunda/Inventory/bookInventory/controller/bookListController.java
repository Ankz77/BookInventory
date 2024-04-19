package com.Ankunda.Inventory.bookInventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Ankunda.Inventory.bookInventory.service.bookListService;

@Controller
public class bookListController {

    @Autowired
    private bookListService service;

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id){
        service.deleteById(id);
        return "redirect: /my_books";
    }
}
