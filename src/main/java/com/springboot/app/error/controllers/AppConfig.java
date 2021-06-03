package com.springboot.app.error.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Erick Diaz
 */
@Controller
public class AppConfig {
    
//    Los errores 500 es cuando no existe el template o formatException
    @GetMapping("/index")
    private String index() {
        var numero = 1/0;
        return "index";
    }
    
}
