/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificios;

/**
 *
 * @author Rafael Melara
 */
public class Entrenamiento implements edificio{
     private int vida = 100;
    private int price = 100;
    

    @Override
    public void crearEdificio() {
        System.out.println("Ya puede entrenar tropas");
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
