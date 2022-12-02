package com.mulungu.demo.service;

import com.mulungu.demo.Model.Usuario;
import com.mulungu.demo.Repository.UsuarioRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;
@Getter
@Setter
@Service
public class ProfileService {

        private final UsuarioRepository usuarioRepository;

        public UsuarioService(UsuarioRepository usuarioRepository, UsuarioRepository usuarioRepository1){
            this.usuarioRepository = usuarioRepository;
        }
        public <IncluirUsuarioRequest> Usuario alterar(IncluirUsuarioRequest UsuarioRequest) {
            var data = Instant.now();

            var usuario = new Usuario();
            Object usuarioRequest = new Object();
            BeanUtils.copyProperties(usuarioRequest, usuario);
            usuario.setSenhaUsuario("senha");
            usuario.setSenhaUsuario("senha");

            return usuario;
        }
}

