package com.mulungu.demo.service;

import com.mulungu.demo.Model.Servicos;
import com.mulungu.demo.Repository.ServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServicosService {

    @Autowired
    private ServicosRepository servicosRepository;

    public List<Servicos> buscarTodos(){
        return servicosRepository.findAll();
    }

    public Servicos inserir(Servicos servicos){
        if(servicos.getDocumentData()==null) {
            servicos.setStatus("Pendente");
        } else {
            servicos.setStatus("Concluído");
        }
        return servicosRepository.save(servicos);
    }

    public Servicos alterar(Servicos servicos){
        if (servicos.getDocumentData()!=null) {
            servicos.setStatus("Concluído");
        }
        return servicosRepository.saveAndFlush(servicos);
    }



}
