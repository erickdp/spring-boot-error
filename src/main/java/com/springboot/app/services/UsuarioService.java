package com.springboot.app.services;

import com.springboot.app.models.domain.Usuario;
import java.util.List;

/**
 *
 * @author Erick Diaz
 */
public interface UsuarioService {

    List<Usuario> listar();

    Usuario obtenerPorId(Integer id);
}
