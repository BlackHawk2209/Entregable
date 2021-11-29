package com.ibm.academia.apirest.entities;

import java.io.Serializable;

import com.ibm.academia.apirest.enums.TipoTarjeta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Tarjeta implements Serializable {

	private TipoTarjeta tipoTarjeta;
	
	@Override
	public String toString() {
		return "Tarjeta [tipoTarjeta=" + tipoTarjeta + "]";
	}


	private static final long serialVersionUID = 2911762464333103201L;

}
