package com.Ankunda.Inventory.bookInventory.repository;

import com.Ankunda.Inventory.bookInventory.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
