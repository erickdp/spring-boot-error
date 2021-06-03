package com.springboot.app.error.errores;

/**
 *
 * @author Erick Diaz
 */
public class UsuarioNoEncontradoException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;
    
    public UsuarioNoEncontradoException(String message) {
        super("Usuario con id ".concat(message).concat(" no existe en el sistema"));
    }
    
}
