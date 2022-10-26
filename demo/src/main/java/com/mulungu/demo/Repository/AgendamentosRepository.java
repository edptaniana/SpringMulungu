package com.mulungu.demo.Repository;

import com.mulungu.demo.Model.Agendamentos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentosRepository extends JpaRepository<Agendamentos, Long> {
}
