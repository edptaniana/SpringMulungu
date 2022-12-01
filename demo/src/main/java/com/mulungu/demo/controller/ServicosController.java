package com.mulungu.demo.controller;

import com.mulungu.demo.Model.Servicos;
import com.mulungu.demo.service.ServicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicosController {

    private ServicosService servicosService;

    @GetMapping("/")
    public List<Servicos> buscarTodos(){
        return servicosService.buscarTodos();
    }

    @PostMapping("/")
    public Servicos inserir(@RequestBody Servicos servicos){
        return servicosService.inserir(servicos);
    }

    @PutMapping("/")
    public Servicos alterar(@RequestBody Servicos servicos){
        return servicosService.alterar(servicos);
    }
}
