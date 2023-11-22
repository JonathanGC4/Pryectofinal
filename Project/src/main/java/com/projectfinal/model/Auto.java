package com.projectfinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auto {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String modelo;
	    private String caracteristicas;
	    private Double tarifa;
	    private boolean disponible;

	    // Constructores, getters y setters

	    public Auto() {
	        // Constructor vacío necesario para JPA
	    }

	    public Auto(String modelo, String caracteristicas, Double tarifa, boolean disponible) {
	        this.modelo = modelo;
	        this.caracteristicas = caracteristicas;
	        this.tarifa = tarifa;
	        this.disponible = disponible;
	    }

	    // Getters y setters

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public String getCaracteristicas() {
	        return caracteristicas;
	    }

	    public void setCaracteristicas(String caracteristicas) {
	        this.caracteristicas = caracteristicas;
	    }

	    public Double getTarifa() {
	        return tarifa;
	    }

	    public void setTarifa(Double tarifa) {
	        this.tarifa = tarifa;
	    }

	    public boolean isDisponible() {
	        return disponible;
	    }

	    public void setDisponible(boolean disponible) {
	        this.disponible = disponible;
	    }
	}
	

