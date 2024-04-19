package com.Ankunda.Inventory.bookInventory.repository;

import com.Ankunda.Inventory.bookInventory.entity.BookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyBookRepository extends  JpaRepository<BookList, Integer> {

    @Override
    <S extends BookList> S save(S entity);

    void deleteById(int id);

    List<BookList> findByAuthor(String author);

    void save(Object book);
}
