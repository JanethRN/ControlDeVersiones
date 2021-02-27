/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta;

/**
 *
 * @author Jordan
 */

    //--------------------------------------------------------------------------
    //Clase abstracta porque contiene una o mas definiciones de métodos 
    //abstractos   Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------

abstract class Animal {
    
    //--------------------------------------------------------------------------
    //Variable que contendra el nombre del animal Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
 
	private String name;
        
    //--------------------------------------------------------------------------
    // setter para definir el nombre del animal Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
 
	public void setName(String name) {
		this.name=name;
	}
        
    //--------------------------------------------------------------------------
    //  getter para obtener el nombre del animal Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
 
	public String getName() {
		return this.name;
	}
 
	// Definiemos una clase abstracta
	// Creas un patron de diseño que tienes que seguir obligatoriamente
	// en tu jerarquia de herencia
        
	public abstract String tipoAnimal();
 
}
