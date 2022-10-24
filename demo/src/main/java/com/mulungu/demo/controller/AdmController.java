package com.mulungu.demo.controller;


import com.mulungu.demo.Model.Adm;
import com.mulungu.demo.Model.Usuario;
import com.mulungu.demo.Repository.AdmRepository;
import com.mulungu.demo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/adm")
public class AdmController {

    @Autowired
    AdmRepository admRepository;

    @PostMapping("/create")
    public Adm criar (@RequestBody Adm adm){
        return admRepository.save(adm);
    }

    @GetMapping("/list")
    public List<Adm> listar(){

        return admRepository.findAll();
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public ResponseEntity<String> delete (@RequestParam Long id) {
        admRepository.deleteById(id);
        return new ResponseEntity<String>("Adm deletado com sucesso", HttpStatus.OK);
    }
}
