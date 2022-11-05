package com.mulungu.demo.Model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "contato")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContato;

    @Column(name = "TelefoneFixo", length = 15)
    @NotNull
    private String TelefoneFixo;

    @Column(name = "CelulardeContato", length = 15)
    @NotNull
    private String CelulardeContato;

    @Column(name = "emailContato", length = 15)
    @NotNull
    private String emailContato;

}
