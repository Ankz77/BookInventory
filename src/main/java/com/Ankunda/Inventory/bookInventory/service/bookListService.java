package com.Ankunda.Inventory.bookInventory.service;

import java.util.List;

import com.Ankunda.Inventory.bookInventory.entity.BookList;
import com.Ankunda.Inventory.bookInventory.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookListService {

    @Autowired
    private MyBookRepository mybook;

    public bookListService() {
        this.mybook = mybook;
    }

    public void saveMyBooks(){
        Object book = new Object();
        mybook.save(book);
    }

    public List<BookList> getAllMyBooks(){ return mybook.findAll();}

    public void deleteById(int id){mybook.deleteById(id);}

}
