package com.mulungu.demo.controller;

import com.mulungu.demo.Model.Usuario;
import com.mulungu.demo.Repository.UsuarioRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import static javax.swing.UIManager.get;

@RestController
@CrossOrigin
@Getter
@Setter
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping("/create")
    public Usuario criar (@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/list")
    public List<Usuario> listar(){

        return usuarioRepository.findAll();
    }
    @PutMapping("/edit")
    @ResponseBody
    public ResponseEntity<String> edit(@RequestParam Long senhaUsuario) {
        usuarioRepository.save(Usuario.get(senhaUsuario));
        return new ResponseEntity<String>("Usuario editado com sucesso", HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public ResponseEntity<String> delete (@RequestParam Long id) {
        usuarioRepository.deleteById(id);
        return new ResponseEntity<String>("Usuario deletado com sucesso", HttpStatus.OK);
    }
}
