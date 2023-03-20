package com.mycompany.trabalhoprojetosistema.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "modelo_aeronave")
public class Aeronave implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modelo", nullable = false)
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "capacidade_passageiros")
    private Integer qtdPassageiro;

    @Column(name = "capacidade_carga")
    private Integer qtdCarga;

    @Column(name = "autonomia")
    private Integer qtdAutonomia;

    @ManyToOne
    @JoinColumn(name = "fabricante")
    private Fabricante fabricante;

    private Integer idFabricante;

    private String nomeFabricante;

}
