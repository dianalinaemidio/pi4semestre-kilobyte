package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mensagem {

    @GetMapping("/")
    public ResponseEntity<String> helloWorld(@RequestParam String mensagem) {
        return ResponseEntity.ok(mensagem);
    }
}
