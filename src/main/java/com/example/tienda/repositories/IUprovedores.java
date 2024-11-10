package com.example.tienda.repositories;

import com.example.tienda.models.provedoresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUprovedores extends JpaRepository<provedoresModel, Long> {
}
