package com.Ankunda.Inventory.bookInventory.entity;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Book {

//    private static final Object GenerationType = null;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private static int id;
    private String name;
    private String author;
    private String price;
    public Book(int id, String name, String author, String price){
        super();
        Book.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(){
        super();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        Book.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = String.valueOf(price);
    }
}
