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
public class Oficial extends Operario{
    
    //--------------------------------------------------------------------------
    //Constructor por defecto  Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------

    public Oficial() {
    }
    
    //--------------------------------------------------------------------------
    //Constructor con un parámetro  Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------

    public Oficial(String nombre) {
        super(nombre);
        System.out.println("Constructor de Oficial");                                                             
    }
   
    //--------------------------------------------------------------------------
    //Método toString() Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
    
    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}