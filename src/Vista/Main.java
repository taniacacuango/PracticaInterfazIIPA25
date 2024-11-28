/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Circulo;
import Modelo.Cuadrado;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        //INSTANCIAS OBJETO
        //NO SE PUEDE INSTANCIAR OBJETOS DE UNA INTERFAZ
        Cuadrado c1=new Cuadrado();
        c1.setLado(6);
        System.out.println(c1.toString());
        System.out.println("El Perímetro es:"+c1.calcularPerimetro());
        System.out.println("El Área es:"+c1.calcularArea());
        
        Circulo cl1=new Circulo("Circulo 1", 5);
         System.out.println(cl1.toString());
        System.out.println("El Perímetro es:"+cl1.calcularPerimetro());
        System.out.println("El Área es:"+cl1.calcularArea());
        
       
    }
    
}
