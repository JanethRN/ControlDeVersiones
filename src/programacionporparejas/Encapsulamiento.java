/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionporparejas;

/**
 *
 * @author DELL
 */
public class Encapsulamiento {
    
    //--------------------------------------------------------------------------
    //Atributos   Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
    
    private String nombre;
    private int patas;
    
       
    //--------------------------------------------------------------------------
    //Métodos get y set Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
    
    public String getNombre() {
        return nombre;
    }
    
    public int getPatas(){ 
        return patas;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    //--------------------------------------------------------------------------
    //Métodos main Jordan Espinosa-Julissa Renteria
    //--------------------------------------------------------------------------
    public  void main (String[] args) {
       Encapsulamiento gato = new Encapsulamiento();
       gato.setNombre("Nemo");
       gato.setPatas(3);
       System.out.println("Mi gato se llama: " + gato.getNombre());
       System.out.println("El número de patas de mi gato es: " + gato.getPatas());
       gato.setPatas(10);
       gato.setPatas(-50);
    }
}