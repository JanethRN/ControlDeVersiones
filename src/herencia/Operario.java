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
public class Operario extends Empleado{

    //--------------------------------------------------------------------------
    //Constructor con un parámetro  Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
    public Operario(String nombre) {
        super(nombre);
        System.out.println("Constructor de Operario");
    }

    //--------------------------------------------------------------------------
    //Constructor por defecto  Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
    public Operario() {
    }

    //--------------------------------------------------------------------------
    //Método toString() Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------                                         
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
   
}