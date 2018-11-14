/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.tuel.api.visitors.model;

import com.jmethods.catatumbo.Embeddable;

/**
 *
 * @author juan.herrera
 */
@Embeddable
public class Apartment {
    
    Integer number;
    
    String block;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
    
    
    
}
