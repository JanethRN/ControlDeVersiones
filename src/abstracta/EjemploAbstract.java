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
public class EjemploAbstract {
    
public static void main(String[] args) {
 
		// definimos una variable que contendra clases que hereden del tipo "Animal"
		Animal [] misAnimales = new Animal[2];
 
		// instanciamos la clase perro y gato
		misAnimales[0]=new Perro("boby");
		misAnimales[1]=new Gato("blanquito");
 
		for(Animal e:misAnimales) {
 
			// ejecutara la función tipoAnimal() de la clase que haya sido instanciada.
			// Esto se llama polimorfismo
			System.out.println(e.tipoAnimal());
		}
 
	}
 
}