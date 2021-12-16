package com.ibm.academia.apirest.repositories;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.ibm.academia.apirest.entities.Tarjeta;

@DataJpaTest
public class TarjetaRepositoryTest {
 
	@Autowired
	TarjetaRepository tarjetaRepository;
	
	@Test
	@DisplayName("Test buscar tarjetas por pasion, salario y edad")
	void buscarTarjetaAdecuada()
	{
		//WHEN
		List<Tarjeta> expected =(List<Tarjeta>)tarjetaRepository.buscarTarjetaAdecuada("SHOPPING", 8000, 20);
		
		//THEN
		assertThat(((List<Tarjeta>)expected).size() == 2).isTrue();
	}
}
