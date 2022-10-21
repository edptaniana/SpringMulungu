package com.mulungu.demo.controller;


import com.mulungu.demo.Model.Contato;
import com.mulungu.demo.Model.Endereco;
import com.mulungu.demo.Repository.ContatoRepository;
import com.mulungu.demo.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoController {

    @Autowired
    ContatoRepository contatoRepository;

    @PostMapping("/create")
    public Contato criar (@RequestBody Contato contato){
        return contatoRepository.save(contato);
    }

    @GetMapping("/list")
    public List<Contato> listar(){

        return contatoRepository.findAll();
    }
    @DeleteMapping("/delete")
    @ResponseBody
    public ResponseEntity<String> delete (@RequestParam Long id) {
        contatoRepository.deleteById(id);
        return new ResponseEntity<String>("Contato deletado com sucesso", HttpStatus.OK);
    }

}
