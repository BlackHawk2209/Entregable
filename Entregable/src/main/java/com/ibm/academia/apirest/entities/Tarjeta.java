package com.ibm.academia.apirest.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ibm.academia.apirest.enums.Pasion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tarjetas", schema="banamex")
public class Tarjeta implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	 
	@Column(name = "nombre", unique = false, nullable = false, length=80)
	private String nombre;
	
	@Column(name = "edad_minima", nullable = false)
	private Integer edadMinima;
	
	@Column(name = "edad_maxima", nullable = false)
	private Integer edadMaxima;
	
	@Column(name = "salario_Minimo", nullable = false)
	private Integer salarioMinimo;
	
	@Column(name = "salario_Maximo", nullable = false)
	private Integer salarioMaximo;
	
	@Column(name = "pasion")
	@Enumerated(EnumType.STRING)
	private Pasion pasion;
	

	@Override
	public int hashCode() {
		return Objects.hash(edadMaxima, edadMinima, id, nombre, pasion, salarioMaximo, salarioMinimo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(edadMaxima, other.edadMaxima) && Objects.equals(edadMinima, other.edadMinima)
				&& Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre) && pasion == other.pasion
				&& Objects.equals(salarioMaximo, other.salarioMaximo)
				&& Objects.equals(salarioMinimo, other.salarioMinimo);
	}


	private static final long serialVersionUID = 2911762464333103201L;

}
