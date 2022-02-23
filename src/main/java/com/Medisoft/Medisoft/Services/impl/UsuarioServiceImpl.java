package com.Medisoft.Medisoft.Services.impl;

import com.Medisoft.Medisoft.Entities.Sexo;
import com.Medisoft.Medisoft.Repositories.PersonaRepository;
import com.Medisoft.Medisoft.Domain.Usuario;
import com.Medisoft.Medisoft.Entities.Persona;
import com.Medisoft.Medisoft.Repositories.SexoRepository;
import com.Medisoft.Medisoft.Services.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private SexoRepository sexoRepository;

    @Override
    public Usuario getUsuario(String nombre) {

        List<Persona> personaList = personaRepository.findAll();
        Persona persona = personaRepository.findByNombre(nombre);
        Usuario user = Usuario.builder()
                .nombre(persona.getNombre())
                .apellido(persona.getApellido())
                .build();

        return user;
    }

    @Override
    public void postPersona(Persona persona) {
        sexoRepository.save(persona.getSexo());
        personaRepository.save(persona);
    }
}
