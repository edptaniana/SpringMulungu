package com.mulungu.demo.Model;

import com.mulungu.demo.entity.DocumentData;
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

    @ManyToOne
    @JoinColumn(name = "document_data_id")
    private DocumentData documentData;

    private String status;

}
