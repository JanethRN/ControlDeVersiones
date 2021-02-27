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
public abstract class Animal {
    
    //--------------------------------------------------------------------------
    //Atributos  Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
    
    private String nombre,color;
    
    //--------------------------------------------------------------------------
    //Constructor con parámetros  Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
    
    public Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    public abstract void comer();
    public abstract void sonido();
    
}
    
