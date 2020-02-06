package com.archetype.ti.hiworld.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.archetype.ti.hiworld.app.models.entity.Saludo;

public interface ISaludoDao extends CrudRepository<Saludo, String>{

}