package com.Ankunda.Inventory.bookInventory.service;

import java.util.List;

import com.Ankunda.Inventory.bookInventory.entity.BookList;
//import com.Ankunda.Inventory.bookInventory.entity.BookList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Ankunda.Inventory.bookInventory.entity.Book;
import com.Ankunda.Inventory.bookInventory.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bRepo;

    public static List<BookList> getAllMyBooks() {
        return List.of();
    }

    public void save(Book b){
        bRepo.save(b);
    }

    public List<Book> getAllBook(){return bRepo.findAll();}

    public Book getBookById(int id){
        return (Book) bRepo.findById(id).get();
    }

    public void deleteById(int id){
        bRepo.deleteById(id);
    }
}
