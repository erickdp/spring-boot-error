package com.springboot.app.error.controllers;

import com.springboot.app.error.errores.UsuarioNoEncontradoException;
import com.springboot.app.error.models.domain.Usuario;
import com.springboot.app.error.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Erick Diaz
 */
@Controller
public class AppConfig {
    
    @Autowired
    private UsuarioService usuarioService;
    
//    Los errores 500 es cuando no existe el template o formatException
    @SuppressWarnings("unused") // suprime el warning pero no hace nada mas funcional
    @GetMapping("/index")
    private String index() {
        var numero = Integer.parseInt("10x");
        return "index";
    }
    
    @GetMapping("ver/{id}")
    private String ver(@PathVariable Integer id, Model modelo) {
        Usuario usuario = this.usuarioService.obtenerPorId(id);
        if(usuario == null) {
            throw new UsuarioNoEncontradoException(String.valueOf(id));
        }
        modelo.addAttribute("usuario", usuario);
        modelo.addAttribute("titulo", "Detalle del usuario: ".concat(usuario.getNombre()));
        return "ver";
    }
    
}
