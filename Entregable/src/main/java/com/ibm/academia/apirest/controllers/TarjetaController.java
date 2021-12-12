package com.ibm.academia.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.apirest.exceptions.NotFoundException;

import com.ibm.academia.apirest.entities.Tarjeta;
import com.ibm.academia.apirest.services.TarjetaDAO;





/**
 * Endpoint para buscar una lista de tarjetas adecuada para el posible cliente
 * @author BPR
 *@param recibe pasion, salario y edad
 *@return retorna una lista de tarjetas que puede solicitar
 */
@RestController
@RequestMapping("/tarjeta")
public class TarjetaController {
	@Autowired
	private TarjetaDAO tarjetaDao;
	
	@GetMapping("/tarjeta/pasion/{pasion}/salario/{salario}/edad/{edad}")
	public ResponseEntity<?> buscarTarjetaAdecuada(@PathVariable String pasion, @PathVariable Integer salario, @PathVariable Integer edad)
	{
		List<Tarjeta> tarjetas = (List<Tarjeta>)tarjetaDao.buscarTarjetaAdecuada(pasion, salario, edad);
		if(!tarjetas.isEmpty())
				throw new NotFoundException(String.format("No se encontro una tarjeta adecuada para usted"));
			return new ResponseEntity<List<Tarjeta>>(tarjetas, HttpStatus.OK);
			
	}
	
}
