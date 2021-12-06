package com.ibm.academia.apirest.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="pasiones", schema="banamex")
public class Pasion implements Serializable{


	public Pasion() {
	}



	public Pasion(Integer id, String pasionNombre, Set<Tarjeta> tarjetas) {
		this.id = id;
		this.pasionNombre = pasionNombre;
		this.tarjetas = tarjetas;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	 
	@Column(name = "pasionNombre", unique = true, nullable = false, length=80)
	private String pasionNombre;
	
	@ManyToMany(mappedBy = "pasiones", fetch = FetchType.LAZY)
	private Set<Tarjeta> tarjetas;
	
	
	
	@Override
	public String toString() {
		return "Pasion [pasionNombre=" + pasionNombre + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, pasionNombre, tarjetas);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasion other = (Pasion) obj;
		return Objects.equals(id, other.id) && Objects.equals(pasionNombre, other.pasionNombre)
				&& Objects.equals(tarjetas, other.tarjetas);
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getPasionNombre() {
		return pasionNombre;
	}



	public void setPasionNombre(String pasionNombre) {
		this.pasionNombre = pasionNombre;
	}



	public Set<Tarjeta> getTarjetas() {
		return tarjetas;
	}



	public void setTarjetas(Set<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}



	private static final long serialVersionUID = 1920825515218423789L;
}
