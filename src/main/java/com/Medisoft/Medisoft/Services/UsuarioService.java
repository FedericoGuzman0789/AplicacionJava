package com.Medisoft.Medisoft.Services;

import com.Medisoft.Medisoft.Domain.Usuario;
import com.Medisoft.Medisoft.Entities.Persona;

public interface UsuarioService {
    Usuario getUsuario(String nombre);
    void postPersona(Persona persona);
}
