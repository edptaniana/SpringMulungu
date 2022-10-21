package com.mulungu.demo.controller;

import com.mulungu.demo.Model.Cartorio;
import com.mulungu.demo.Model.Usuario;
import com.mulungu.demo.Repository.CartorioRepository;
import com.mulungu.demo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
}
