package com.springboot.app.error.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Erick Diaz
 */
@Controller
public class AppConfig {
    
    @GetMapping("/index")
    private String index() {
        return "index";
    }
    
}
