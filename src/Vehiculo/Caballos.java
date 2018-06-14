/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

/**
 *
 * @author Rafael Melara
 */
public class Caballos implements vehiculos{
    private int vida;
    private int costo;

    @Override
    public String toString() {
        return "Caballos{" + "vida=" + vida + ", costo=" + costo + '}';
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    

    @Override
    public void crear() {
        System.out.println("Vehiculo creado yiiii");
    }
    
}
