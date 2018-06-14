/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

/**
 *
 * @author Rafael Melara
 */
public class Squad implements milicia{
    
    private int vida = 50;
    private int ataque = 70;
    private int costo = 85;

    @Override
    public void entrenar() {
        System.out.println("Ha entrenado al esquadron");
    }

    @Override
    public String toString() {
        return "Squad{" + "vida=" + vida + ", ataque=" + ataque + ", costo=" + costo + '}';
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    
}
