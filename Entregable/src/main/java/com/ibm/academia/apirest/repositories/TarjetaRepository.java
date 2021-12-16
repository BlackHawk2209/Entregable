package com.ibm.academia.apirest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Tarjeta;

@Repository
public interface TarjetaRepository extends CrudRepository<Tarjeta, Integer> {

	@Query(value = "SELECT nombre FROM banamex.tarjetas WHERE pasion=UPPER('?1') AND salario_minimo<=?2 AND salario_maximo>=?2 AND edad_minima<=?3 AND edad_maxima>=?3;", nativeQuery = true)
	public Iterable<Tarjeta> buscarTarjetaAdecuada(String pasion, Integer salario, Integer edad);

	
}
