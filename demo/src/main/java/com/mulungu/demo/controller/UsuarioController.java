package com.mulungu.demo.controller;

import com.mulungu.demo.Model.Usuario;
import com.mulungu.demo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario criar (@RequestBody Usuario usuario){return usuarioRepository.save(usuario);
    }

    @GetMapping
    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }
}
