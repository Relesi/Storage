package com.storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storage.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, String> {

}
