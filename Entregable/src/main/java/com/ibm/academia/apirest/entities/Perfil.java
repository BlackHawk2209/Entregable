package com.ibm.academia.apirest.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import com.ibm.academia.apirest.enums.Preferencia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Perfil implements Serializable{

	private Preferencia preferecia;
	 
	private BigDecimal sueldo;
	
	private int edad; 
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(edad, preferecia, sueldo);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		return edad == other.edad && preferecia == other.preferecia && Objects.equals(sueldo, other.sueldo);
	}




	private static final long serialVersionUID = -6778267421386051581L;
	
	
}
