package com.Ankunda.Inventory.bookInventory.entity;

import jakarta.persistence.GenerationType;

public @interface GeneratedValue {
    GenerationType strategy();
}
