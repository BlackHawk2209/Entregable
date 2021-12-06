package com.ibm.academia.apirest.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Tarjeta;

@Repository
public interface TarjetaRepository extends CrudRepository<Tarjeta, Integer>   {

	@Query(value = "SELECT * FROM banamex.tarjetas WHERE pasion = ?1 WHERE ?2 BETWEEN salario_minimo AND salario_maximo WHERE ?3 BETWEEN edad_minima AND edad_maxima", nativeQuery = true)
	public Iterable<Tarjeta> buscarTarjetaAdecuada(String pasion, Integer salario, Integer edad);
	
}
