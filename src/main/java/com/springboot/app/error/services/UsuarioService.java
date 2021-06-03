package com.springboot.app.error.services;

import com.springboot.app.error.models.domain.Usuario;
import java.util.List;

/**
 *
 * @author Erick Diaz
 */
public interface UsuarioService {

    List<Usuario> listar();

    Usuario obtenerPorId(Integer id);
}
