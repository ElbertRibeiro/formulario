package com.github.formularioapi.core.formulario;

import com.github.formularioapi.core.atencaobasica.AtencaoBasica;
import com.github.formularioapi.core.endereco.Endereco;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document public class Formulario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String nameUser;
    private int quantidadeMoradores;
    private String zonaEleitoral;
    private String fonteRenda;
    @OneToMany(cascade = CascadeType.PERSIST) @JoinColumn(name = "cep")
    private Endereco endereco;
    @OneToMany(cascade = CascadeType.PERSIST) @JoinColumn(name = "id")
    private AtencaoBasica atencaoBasica;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getQuantidadeMoradores() {
        return quantidadeMoradores;
    }

    public void setQuantidadeMoradores(int quantidadeMoradores) {
        this.quantidadeMoradores = quantidadeMoradores;
    }

    public String getZonaEleitoral() {
        return zonaEleitoral;
    }

    public void setZonaEleitoral(String zonaEleitoral) {
        this.zonaEleitoral = zonaEleitoral;
    }

    public String getFonteRenda() {
        return fonteRenda;
    }

    public void setFonteRenda(String fonteRenda) {
        this.fonteRenda = fonteRenda;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public AtencaoBasica getAtencaoBasica() {
        return atencaoBasica;
    }

    public void setAtencaoBasica(AtencaoBasica atencaoBasica) {
        this.atencaoBasica = atencaoBasica;
    }
}
