package com.springboot.app.error.controllers;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author Erick Diaz
 */
@ControllerAdvice // Maneja las rutas a excepciones
public class ErrorHandlerController {
    
    @ExceptionHandler(ArithmeticException.class)
    public String aritmeticError(ArithmeticException ex, Model model) {
        model.addAttribute("error", "Error de arimética");
        model.addAttribute("message", ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        return "error/aritmetica";
    }
    
}
