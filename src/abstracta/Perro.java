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
class Perro extends Animal {
    
    //--------------------------------------------------------------------------
    //  Constructor con párametros Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
 
	public Perro(String name) {
		super.setName(name);
	}
 
	// Estamos obligados a crear este metodo, ya que heredamos de Animal
	// que es una clase abstracta, por lo que hay que definir todos los
	// metodos abstractos que tenga
        
	public String tipoAnimal() {
		return "El animal es un perro. Se llama " + super.getName();
	}
}
