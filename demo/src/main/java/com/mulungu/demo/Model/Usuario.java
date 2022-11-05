package com.mulungu.demo.Model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 100)
    @NotNull
    private String nomeUsuario;

    @Column(name = "cpf", length = 14)
    @NotNull
    private String cpfUsuario;

    @Column(name = "emailUsuario",length = 100)
    @NotNull
    private String emailUsuario;

    @Column(name = "senha",length = 100)
    @NotNull
    private String senhaUsuario;

    @Column(name = "numero",length = 100)
    @NotNull
    private String numeroUsuario;


}
