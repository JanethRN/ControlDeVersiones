/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author DELL
 */
public class Empleado {
    
    //--------------------------------------------------------------------------
    //Atributos   Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
    
     private String nombre;

    //--------------------------------------------------------------------------
    //Constructor por defecto  Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
     
    public Empleado() {
    }
    
    //--------------------------------------------------------------------------
    //Constructor con un parámetro  Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
    public Empleado(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor de Empleado " + nombre);
    }
   
    //--------------------------------------------------------------------------
    //Métodos get y set Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //--------------------------------------------------------------------------
    //Método toString() Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
                                  
    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}
