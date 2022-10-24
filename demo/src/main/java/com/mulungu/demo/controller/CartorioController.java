package com.mulungu.demo.controller;

import com.mulungu.demo.Model.Cartorio;
import com.mulungu.demo.Model.Usuario;
import com.mulungu.demo.Repository.CartorioRepository;
import com.mulungu.demo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cartorio")
public class CartorioController {

    @Autowired
    CartorioRepository cartorioRepository;

    @PostMapping("/create")
    public Cartorio criar (@RequestBody Cartorio cartorio){
        return cartorioRepository.save(cartorio);
    }

    @GetMapping("/list")
    public List<Cartorio> listar(){
        return cartorioRepository.findAll();
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public ResponseEntity<String> delete (@RequestParam Long id) {
        cartorioRepository.deleteById(id);
        return new ResponseEntity<String>("Deletado", HttpStatus.OK);
    }
}

