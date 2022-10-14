package com.mulungu.demo.Model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "adm")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Adm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 100)
    @NotNull
    private String nome;

    @Column(name = "email",length = 100)
    @NotNull
    private String email;

    @Column(name = "senha",length = 100)
    @NotNull
    private String senha;

    @Column(name = "NomeCartorio",length = 100)
    @NotNull
    private String NomeCartorio;

}
