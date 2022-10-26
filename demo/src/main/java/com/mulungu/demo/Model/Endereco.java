package com.mulungu.demo.Model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "endereco")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEndereco;

    @Column(name = "logradouro", length = 100)
    @NotNull
    private String logradouro;

    @Column(name = "cep", length = 100)
    @NotNull
    private String cep;

    @Column(name = "cidade", length = 100)
    @NotNull
    private String cidade;


}
