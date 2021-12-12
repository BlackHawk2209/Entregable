package com.ibm.academia.apirest.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

 

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="tarjetas", schema="banamex")
public class Tarjeta implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	 
	@Column(name = "nombre", unique = true, nullable = false, length=80)
	private String nombre;
	
	@Column(name = "edad_minima", nullable = false)
	private Integer edadMinima;
	
	@Column(name = "edad_maxima", nullable = false)
	private Integer edadMaxima;
	
	@Column(name = "salario_Minimo", nullable = false)
	private Integer salarioMinimo;
	
	@Column(name = "salario_Maximo", nullable = false)
	private Integer salarioMaximo;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
			name = "tarjeta_pasion", schema = "banamex",
			joinColumns = @JoinColumn(name = "tarjeta_id"),
			inverseJoinColumns = @JoinColumn(name = "pasion_id")
	)
	private Set<Pasion> pasiones;
	
	public void addPasion(Pasion pasion){
        this.pasiones.add(pasion);
    }



	@Override
	public String toString() {
		return "Tarjeta [nombre=" + nombre + "]";
	}





	@Override
	public int hashCode() {
		return Objects.hash(edadMaxima, edadMinima, id, nombre, pasiones, salarioMaximo, salarioMinimo);
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
				&& Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(pasiones, other.pasiones) && Objects.equals(salarioMaximo, other.salarioMaximo)
				&& Objects.equals(salarioMinimo, other.salarioMinimo);
	}







	private static final long serialVersionUID = 2911762464333103201L;

}
