package com.example.spring.controller;

import com.example.spring.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final List<Item> items = new ArrayList<>();


    @GetMapping("/all")
    public List<Item> getAllItems() {
        return items;
    }


    @PostMapping
    public String addItem(@RequestBody Item item) {
        items.add(item);
        return "Item added successfully!";
    }
}
