/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Jordan
 */
public class Perro extends Animal{
    
        
    //--------------------------------------------------------------------------
    //Constructor con parámetros  Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------

    public Perro(String nombre, String color) {
        super(nombre, color);
    }
    
        
    //--------------------------------------------------------------------------
    //Métodos  Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------

    
    @Override
    public void comer() {
        System.out.println("El perro es carnivoro");
    }

    @Override
    public void sonido() {
        System.out.println("el perro ladra");
    }
    
}