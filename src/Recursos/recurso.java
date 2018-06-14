/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import java.util.logging.Logger;

/**
 *
 * @author Rafael Melara
 */
public class recurso {
    private int  oro;
    private int metal;
    private int diamante;

    public recurso(int oro, int metal, int diamante) {
        this.oro = oro;
        this.metal = metal;
        this.diamante = diamante;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getMetal() {
        return metal;
    }

    public void setMetal(int metal) {
        this.metal = metal;
    }

    public int getDiamante() {
        return diamante;
    }

    public void setDiamante(int diamante) {
        this.diamante = diamante;
    }
    
    private static final Logger LOG = Logger.getLogger(recurso.class.getName());
    
    
    
    
}
