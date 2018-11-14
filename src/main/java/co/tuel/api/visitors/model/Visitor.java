/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.tuel.api.visitors.model;

import com.jmethods.catatumbo.Entity;
import com.jmethods.catatumbo.Identifier;
import javax.validation.constraints.NotNull;

/**
 *
 * @author juan.herrera
 */
@Entity(kind = "visitor")
public class Visitor {
    
    @Identifier(autoGenerated = true)
    private Long id;
    
    @NotNull
    private String identificationType;
    
    @NotNull
    private Long identificationNumber;
    
    @NotNull
    private String lastName;
    
    @NotNull
    private String firstName;
    
    @NotNull
    private String tipoVisitante;
    
    @NotNull
    private String residentialUnit;
    
    @NotNull
    private Apartment apartment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public Long getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(Long identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTipoVisitante() {
        return tipoVisitante;
    }

    public void setTipoVisitante(String tipoVisitante) {
        this.tipoVisitante = tipoVisitante;
    }

    public String getResidentialUnit() {
        return residentialUnit;
    }

    public void setResidentialUnit(String residentialUnit) {
        this.residentialUnit = residentialUnit;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }
    
}