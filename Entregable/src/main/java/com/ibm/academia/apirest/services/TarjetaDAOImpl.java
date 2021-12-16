package com.ibm.academia.apirest.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.entities.Tarjeta;
import com.ibm.academia.apirest.repositories.TarjetaRepository;

@Service
public class TarjetaDAOImpl implements TarjetaDAO
{
	@Autowired
	TarjetaRepository tarjetaRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Tarjeta> buscarTarjetaAdecuada(String pasion, Integer salario, Integer edad) {
		return tarjetaRepository.buscarTarjetaAdecuada(pasion, salario, edad);
	}

	@Override
	@Transactional
	public Tarjeta guardar(Tarjeta tarjeta) {
		return tarjetaRepository.save(tarjeta);
	}
	
	
}
