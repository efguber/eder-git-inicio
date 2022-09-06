package com.entra21.primeiroprojetospring.model.entity;


import com.entra21.primeiroprojetospring.model.entity.ItemEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "livro")
@PrimaryKeyJoinColumn(name = "id_item",referencedColumnName = "id")
public class LivroEntity extends ItemEntity {

    @Column(name = "autor")
    private String autor;

    @Column(name = "qtd_paginas")
    private Integer qtd_paginas;

    @Column(name = "ano_publicacao")
    private Integer qtd_publicacao;

    @Column(name = "edicao")
    private Integer edicao;
}
