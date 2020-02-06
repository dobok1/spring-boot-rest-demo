package com.archetype.ti.hiworld.app.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "saludos")
public class Saludo {
	@Id
	@Column(length = 2)
	@NotEmpty
	private String locale;

	@NotEmpty
	@Size(max = 30)
	private String idioma;

	@NotEmpty
	@Size(max = 30)
	private String mensaje;

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Saludo) {
			Saludo s = (Saludo) obj;
			if (s.getLocale() != null) {
				return s.getLocale().equals(this.getLocale());
			}
		}

		return false;
	}

}