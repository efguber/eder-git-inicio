package com.entra21.primeiroprojetospring.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
    @Entity
    @Table(name = "dvd")
@PrimaryKeyJoinColumn(name = "id_item",referencedColumnName = "id")
    public class DvdEntity extends ItemEntity {

     @Column(name = "diretor")
    private String diretor;

    @Column(name = "duracao")
    private String duracao;

    @Column(name = "ano_lancamento")
    private Integer ano_lancamento ;
}
