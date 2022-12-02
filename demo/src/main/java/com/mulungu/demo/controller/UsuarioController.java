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

    UsuarioRepository usuarioRepository;

    @PostMapping("/create")
    public Usuario criar (@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/list")
    public List<Usuario> listar(){

        return usuarioRepository.findAll();
    }
    @PutMapping("/{senha}")
    public static Usuario updateById(@RequestBody @PathVariable("senha") Long senhaUsuario) {
        return UsuarioController.updateById(senhaUsuario);
    }


    @DeleteMapping("/delete")
    @ResponseBody
    public ResponseEntity<String> delete (@RequestParam Long id) {
        usuarioRepository.deleteById(id);
        return new ResponseEntity<String>("Usuario deletado com sucesso", HttpStatus.OK);
    }
}
