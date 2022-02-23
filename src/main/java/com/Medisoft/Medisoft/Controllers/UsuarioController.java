package com.Medisoft.Medisoft.Controllers;

import com.Medisoft.Medisoft.Domain.Usuario;
import com.Medisoft.Medisoft.Entities.Persona;
import com.Medisoft.Medisoft.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/getUsuario/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Usuario> getUsuario(@PathVariable String nombre) {
        Usuario user = usuarioService.getUsuario(nombre);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping(value = "/postPersona", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Persona> postUsuario(@RequestBody Persona persona) {
        usuarioService.postPersona(persona);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
