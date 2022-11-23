package com.mulungu.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name= "DocumentData")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    @Lob
    @Column(name = "documentdata", length = 1000)
    private byte[] documentData;
}
