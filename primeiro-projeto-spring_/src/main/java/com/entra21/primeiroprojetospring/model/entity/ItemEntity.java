package com.entra21.primeiroprojetospring.model.entity;

import com.entra21.primeiroprojetospring.model.entity.AvaliacaoEntity;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "item")

public abstract class ItemEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "valor de venda")
    private Double valor_venda;

    @Column(name = "valor de locacao")
    private Double valor_locacao;

    @Column(name = "emprestado")
    private Boolean emprestado;

    @ManyToOne
    @JoinColumn(name = "id_franquia", referencedColumnName = "id")
    private FranquiaEntity franquia;

   @OneToMany(mappedBy = "item")
    private Set<AvaliacaoEntity> avaliacoes;

   @ManyToMany
   @JoinTable (name = "genero_item",
           joinColumns = @JoinColumn(name = "id_item"),
           inverseJoinColumns = @JoinColumn(name = "id_genero"))
   private Set<GeneroEntity> generos;
}
