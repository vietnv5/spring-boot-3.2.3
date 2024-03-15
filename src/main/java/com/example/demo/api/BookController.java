package com.example.demo.api;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.xml.ws.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@SecurityRequirement(name = "basicAuth")
@RequestMapping("/api/book")
public class BookController {


    @GetMapping("/{id}")
    public String findById(@PathVariable long id) {
        return "OK";
    }

}
