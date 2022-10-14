package com.mulungu.demo.Model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "cartorio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cartorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 100)
    @NotNull
    private String nome;

    @Column(name = "cnpj",length = 100)
    @NotNull
    private String cnpj;


}
