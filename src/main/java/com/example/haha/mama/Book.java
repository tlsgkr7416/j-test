package com.example.haha.mama;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Book {

    @GetMapping("/books")
    public String foo() {
        return "f";
    }
}
