package com.mulungu.demo.controller;


import com.mulungu.demo.Model.Adm;
import com.mulungu.demo.Model.Usuario;
import com.mulungu.demo.Repository.AdmRepository;
import com.mulungu.demo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adm")
public class AdmController {

    @Autowired
    AdmRepository admRepository;

    @PostMapping
    public Adm criar (@RequestBody Adm adm){return admRepository.save(adm);
    }

    @GetMapping
    public List<Adm> listar(){
        return admRepository.findAll();
    }
}
