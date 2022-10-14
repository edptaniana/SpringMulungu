package com.mulungu.demo.Repository;

import com.mulungu.demo.Model.Endereco;
import com.mulungu.demo.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
