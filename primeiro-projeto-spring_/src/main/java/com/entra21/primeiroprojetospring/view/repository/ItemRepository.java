package com.entra21.primeiroprojetospring.view.repository;

import com.entra21.primeiroprojetospring.model.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemEntity, Long> {
}

