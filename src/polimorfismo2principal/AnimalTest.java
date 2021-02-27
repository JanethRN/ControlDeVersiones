/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo2principal;

import polimorfismo.Animal;
import polimorfismo.Perro;
import polimorfismo.Vaca;

public class AnimalTest {

    public static void main(String[] args) { 
        
        Animal animal;
        
        animal=new Perro("bobi","cafe");
        animal.comer();
        animal.sonido();
        
        animal=new Vaca("lili","negro");
        animal.comer();
        animal.sonido();
        
    }

}
