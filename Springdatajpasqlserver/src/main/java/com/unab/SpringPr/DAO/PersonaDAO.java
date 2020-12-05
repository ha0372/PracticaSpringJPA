package com.unab.SpringPr.DAO;

import org.springframework.data.repository.CrudRepository;

import com.unab.SpringPr.Entidades.Persona;

public interface PersonaDAO  extends CrudRepository<Persona, Long> {

}
