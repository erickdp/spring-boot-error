/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.services;

import com.springboot.app.models.domain.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Erick Diaz
 */
@Service
public class UsuarioServiceImp implements UsuarioService {

    private List<Usuario> lista;

    public UsuarioServiceImp() {
        this.lista = new ArrayList<>();
        this.lista.add(new Usuario(1, "Erick", "Diaz"));
        this.lista.add(new Usuario(2, "Omar", "Caiza"));
        this.lista.add(new Usuario(3, "Samuel", "Uta"));
        this.lista.add(new Usuario(4, "Jota", "Jimenex"));
    }

    @Override
    public List<Usuario> listar() {
        return this.lista;
    }

    @Override
    public Usuario obtenerPorId(Integer id) {
        for (Usuario usuario : lista) {
            if(usuario.getId().equals(id)) { // Es de tipo referencia por tanto no se puede hacer con ==
                return usuario;
            }
        }
        return null;
    }

}
