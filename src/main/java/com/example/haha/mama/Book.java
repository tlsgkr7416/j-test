package com.example.haha.mama;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Book {

    private final int a;

    @GetMapping("/books")
    public String foo() {
        return "ffffF";
    }

    public Book(int a) {
        this.a = a;
    }

}
