package com.example.Menu.controller;

import com.example.Menu.Food.Food;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("food")
public class FoodController {
@GetMapping
    public void getAll() {

    }
}
