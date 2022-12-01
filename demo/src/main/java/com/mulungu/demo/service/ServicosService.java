package com.mulungu.demo.service;

import com.mulungu.demo.Model.Servicos;
import com.mulungu.demo.Repository.ServicosRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServicosService {

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
