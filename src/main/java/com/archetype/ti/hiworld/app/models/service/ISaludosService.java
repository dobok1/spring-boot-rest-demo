package com.archetype.ti.hiworld.app.models.service;

import java.util.List;

import com.archetype.ti.hiworld.app.models.entity.Saludo;

public interface ISaludosService {
	public List<Saludo> saludos();
	public Saludo saludar(String locale);
	public Saludo agregarSaludo(Saludo saludo);
	public Saludo actualizarSaludo(Saludo saludo);
	public void eliminarSaludo(String locale);
}