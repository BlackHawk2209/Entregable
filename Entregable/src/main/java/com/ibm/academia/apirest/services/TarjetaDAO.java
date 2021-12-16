package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.entities.Tarjeta;

public interface TarjetaDAO{

	public Iterable<Tarjeta> buscarTarjetaAdecuada(String pasion, Integer salario, Integer edad);
	public Tarjeta guardar(Tarjeta tarjeta);
}
