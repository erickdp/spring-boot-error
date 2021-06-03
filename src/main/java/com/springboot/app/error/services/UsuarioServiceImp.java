package com.springboot.app.error.services;

import com.springboot.app.error.models.domain.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
        for (Usuario usuario : this.lista) {
            if(usuario.getId().equals(id)) { // Es de tipo referencia por tanto no se puede hacer con ==
                return usuario;
            }
        }
        return null;
    }

    @Override
    public Optional<Usuario> obtenerPorIdOptional(Integer id) {
        var usuario = this.obtenerPorId(id); 
        return Optional.ofNullable(usuario); // Convierte a usuario independiente de nulo o no a opcional, of no acepta nulo
    }

}
