package com.Ankunda.Inventory.bookInventory.repository;

import org.apache.catalina.User;

import java.util.List;

public interface JpaRepository<bookList, Integer> {

    List<User> findByLastName(String lastName);
}
