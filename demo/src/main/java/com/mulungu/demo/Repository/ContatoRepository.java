package com.mulungu.demo.Repository;

import com.mulungu.demo.Model.Contato;
import com.mulungu.demo.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
