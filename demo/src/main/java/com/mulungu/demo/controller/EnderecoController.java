package com.mulungu.demo.controller;


import com.mulungu.demo.Model.Cartorio;
import com.mulungu.demo.Model.Endereco;
import com.mulungu.demo.Repository.CartorioRepository;
import com.mulungu.demo.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    EnderecoRepository enderecoRepository;

    @PostMapping
    public Endereco criar (@RequestBody Endereco endereco){return enderecoRepository.save(endereco);
    }

    @GetMapping
    public List<Endereco> listar(){
        return enderecoRepository.findAll();
    }
}
