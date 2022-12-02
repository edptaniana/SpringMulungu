package com.mulungu.demo.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
@Getter
@Setter


public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "", nullable = false)
    private Long id;
    private String nome;
    private String telefone;
    private

}
