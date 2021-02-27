/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Jordan
 * 
 */
public class Vaca extends Animal{
    
    

    //--------------------------------------------------------------------------
    //Constructor con parámetros  Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
    
    public Vaca(String nombre, String color) {
        super(nombre, color);
    }

    //--------------------------------------------------------------------------
    //Métodos  Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------

    
    @Override
    public void comer() {
        System.out.println("La vaca es herbivora");
    }

    @Override
    public void sonido() {
        System.out.println("La vaca muge");
    }
    
}