package com.mulungu.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "servicos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Servicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServico;

}
