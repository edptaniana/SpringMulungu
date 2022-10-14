package com.mulungu.demo.controller;


import com.mulungu.demo.Model.Contato;
import com.mulungu.demo.Model.Endereco;
import com.mulungu.demo.Repository.ContatoRepository;
import com.mulungu.demo.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoController {

    @Autowired
    ContatoRepository contatoRepository;

    @PostMapping
    public Contato criar (@RequestBody Contato contato){return contatoRepository.save(contato);
    }

    @GetMapping
    public List<Contato> listar(){
        return contatoRepository.findAll();
    }
}
