/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.EFS.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String DescripcionE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String DescripcionE) {
        this.nombreE = nombreE;
        this.DescripcionE = DescripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return DescripcionE;
    }

    public void setDescripcionE(String DescripcionE) {
        this.DescripcionE = DescripcionE;
    }
    
   
    
}
